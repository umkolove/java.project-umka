import processing.core.PApplet;

public class lab_3 extends PApplet {

    private int[][] gameField;
    private float x;
    private float y;

    private float extent;

    @Override
    public void settings() {
        fullScreen();
    }

    @Override
    public void setup() {
        gameField = new int[4][4];
        int[] numbers = new int[16];

        for (int i = 0; i < 16; i++) {
            numbers[i] = i + 1;
        }

        shuffleArray(numbers);

        int index = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                gameField[i][j] = numbers[index++];
            }
        }

        x = width / 3f;
        y = 200f;
        extent = (width / 3f) / 4;
    }

    @Override
    public void draw() {
        background(0);
        init();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (gameField[i][j] != 16) {
                    fill(255, 255, 0);
                    textSize(40);
                    text(gameField[i][j], x + extent * j + extent / 2f - 20, y + i * extent + extent / 2f + 10);
                }
            }
        }
    }

    public void init() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                fill(100, 0, 255);
                square(x + extent * j, y + i * extent, extent);
            }
        }
    }

    @Override
    public void keyPressed() {
        switch (keyCode) {
            case UP:
                move(-1, 0);
                break;
            case DOWN:
                move(1, 0);
                break;
            case LEFT:
                move(0, -1);
                break;
            case RIGHT:
                move(0, 1);
                break;
            default:
                fill(0, 255, 0);
                textSize(40);
                textAlign(CENTER, CENTER);
                text("Incorrect button!", width / 2f, height / 2f);
                break;
        }
    }

    public void move(int rowDelta, int colDelta) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (gameField[i][j] == 16) { // Нашли пустую ячейку
                    int newRow = i + rowDelta;
                    int newCol = j + colDelta;
                    if (newRow >= 0 && newRow < 4 && newCol >= 0 && newCol < 4) { // Проверяем границы
                        gameField[i][j] = gameField[newRow][newCol];
                        gameField[newRow][newCol] = 16;
                    }
                    return;
                }
            }
        }
    }

    private void shuffleArray(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int j = (int) random(i + 1); // Случайный индекс от 0 до i включительно
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static void main(String[] args) {
        PApplet.main("lab_3");
    }
}