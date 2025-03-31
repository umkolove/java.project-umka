import processing.core.PApplet;

public class Main extends PApplet {

    private LogicFor2048 logicFor2048;
    private int score;
    private int moves;
    private boolean gameOver;

    @Override
    public void settings() {
        fullScreen();
    }

    @Override
    public void setup() {
        restartGame();
    }

    @Override
    public void draw() {
        background(0);

        if (gameOver) {
            drawGameOver();
        } else {
            drawScoreAndMoves();
            drawBoard();
        }
    }

    private void drawScoreAndMoves() {
        fill(255);
        textSize(40);
        textAlign(LEFT, TOP);
        text("Score: " + score, 50, 50);
        text("Moves: " + moves, 50, 100);

        fill(255, 255, 0);
        textSize(30);
        text("Press 'R' to Restart", width - 300, 50); // Кнопка перезапуска
        text("Press 'S' to Surrender", width - 300, 100); // Кнопка сдачи
    }

    private void drawBoard() {
        float leftBorder = width / 3f;
        float topBorder = 200;
        float rectSize = leftBorder / 4;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int value = logicFor2048.getCoordinates(i, j);

                if (value == 0) {
                    fill(100, 100, 100);
                } else {
                    fill(150 + value * 2 % 105, 0, 45);
                }

                rect(leftBorder + j * rectSize, topBorder + i * rectSize, rectSize, rectSize);

                if (value != 0) {
                    fill(255);
                    textSize(50);
                    textAlign(CENTER, CENTER);
                    text(value, leftBorder + j * rectSize + rectSize / 2, topBorder + i * rectSize + rectSize / 2);
                }
            }
        }
    }

    private void drawGameOver() {
        fill(255, 0, 0);
        textSize(100);
        textAlign(CENTER, CENTER);
        text("ПИПЕЦ ТЫ ЛОХ!!!", width / 2f, height / 2f);

        fill(255);
        textSize(40);
        text("Score: " + score, width / 2f, height / 2f + 100);

        fill(255, 255, 0);
        textSize(30);
        text("Press 'R' to Restart", width / 2f, height / 2f + 150);
    }

    @Override
    public void keyPressed() {
        if (gameOver) {
            if (key == 'r' || key == 'R') {
                restartGame();
            }
            return;
        }

        boolean moved = false;

        switch (keyCode) {
            case UP:
                moved = logicFor2048.moveUp();
                break;
            case DOWN:
                moved = logicFor2048.moveDown();
                break;
            case LEFT:
                moved = logicFor2048.moveLeft();
                break;
            case RIGHT:
                moved = logicFor2048.moveRight();
                break;
            case 'r':
            case 'R':
                restartGame();
                return;
            case 's':
            case 'S':
                surrenderGame();
                return;
        }

        if (moved) {
            logicFor2048.spawnRandomNumber();
            score += logicFor2048.getLastMoveScore();
            moves++;
        }

        if (!logicFor2048.canMove()) {
            gameOver = true;
        }
    }

    private void restartGame() {
        logicFor2048 = new LogicFor2048();
        score = 0;
        moves = 0;
        gameOver = false;
    }

    private void surrenderGame() {
        gameOver = true;
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}