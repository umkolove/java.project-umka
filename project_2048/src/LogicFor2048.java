import java.util.Random;

public class LogicFor2048 {

    private int[][] gameBoard;
    private int lastMoveScore;

    public LogicFor2048() {
        gameBoard = new int[4][4];
        spawnRandomNumber();
        spawnRandomNumber();
    }

    public boolean moveLeft() {
        boolean moved = false;
        for (int i = 0; i < 4; i++) {
            int[] row = gameBoard[i];
            int[] newRow = new int[4];
            int mergePos = -1;

            for (int j = 0, pos = 0; j < 4; j++) {
                if (row[j] != 0) {
                    if (pos > 0 && newRow[pos - 1] == row[j] && mergePos != pos - 1) {
                        newRow[pos - 1] *= 2;
                        lastMoveScore += newRow[pos - 1];
                        mergePos = pos - 1;
                    } else {
                        newRow[pos++] = row[j];
                    }
                    moved = true;
                }
            }

            gameBoard[i] = newRow;
        }
        return moved;
    }

    public boolean moveRight() {
        reverse();
        boolean moved = moveLeft();
        reverse();
        return moved;
    }

    public boolean moveUp() {
        rotate();
        boolean moved = moveLeft();
        rotateBack();
        return moved;
    }

    public boolean moveDown() {
        rotate();
        boolean moved = moveRight();
        rotateBack();
        return moved;
    }

    private void reverse() {
        for (int i = 0; i < 4; i++) {
            int left = 0, right = 3;
            while (left < right) {
                int temp = gameBoard[i][left];
                gameBoard[i][left] = gameBoard[i][right];
                gameBoard[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    private void rotate() {
        int[][] temp = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                temp[i][j] = gameBoard[3 - j][i];
            }
        }
        gameBoard = temp;
    }

    private void rotateBack() {
        int[][] temp = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                temp[i][j] = gameBoard[j][3 - i];
            }
        }
        gameBoard = temp;
    }

    public void spawnRandomNumber() {
        Random rand = new Random();
        boolean placed = false;

        while (!placed) {
            int row = rand.nextInt(4);
            int col = rand.nextInt(4);

            if (gameBoard[row][col] == 0) {
                gameBoard[row][col] = rand.nextBoolean() ? 2 : 4;
                placed = true;
            }
        }
    }

    public boolean canMove() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (gameBoard[i][j] == 0) return true; // Пустая ячейка
                if (i < 3 && gameBoard[i][j] == gameBoard[i + 1][j]) return true; // Вертикальное слияние
                if (j < 3 && gameBoard[i][j] == gameBoard[i][j + 1]) return true; // Горизонтальное слияние
            }
        }
        return false;
    }

    public int getCoordinates(int x, int y) {
        return gameBoard[x][y];
    }

    public int getLastMoveScore() {
        return lastMoveScore;
    }

    public void resetLastMoveScore() {
        lastMoveScore = 0;
    }

    public void printBoard() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(gameBoard[i][j] + "\t");
            }
            System.out.println();
        }
    }
}