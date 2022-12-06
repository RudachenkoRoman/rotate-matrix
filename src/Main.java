import java.util.Random;

/**
 *
 */

public class Main {
    public static final int SIZE = 8;

    public static void main(String[] args) {

        int[][] colors = new int[SIZE][SIZE];
        int[][] rotatedColors90 = new int[SIZE][SIZE];
        int[][] rotatedColors180 = new int[SIZE][SIZE];
        int[][] rotatedColors270 = new int[SIZE][SIZE];

        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        System.out.println("Стандартная матрица :");
        printMatrix(colors);
        rotateMatrix(colors, rotatedColors90, rotatedColors180, rotatedColors270);
        System.out.println("Поворот на 90 градусов :");
        printMatrix(rotatedColors90);
        System.out.println("Поворото на 180 градусов :");
        printMatrix(rotatedColors180);
        System.out.println("Поворот на 270 градусов :");
        printMatrix(rotatedColors270);
    }

    public static void printMatrix(int[][] colors) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%4d", colors[i][j]);
            }
            System.out.println();
        }
    }

    public static void rotateMatrix(int[][] colors, int[][] rotatedColors90,
                                    int[][] rotatedColors180, int[][] rotatedColors270) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColors90[i][j] = colors[j][SIZE - i - 1];
                rotatedColors180[i][j] = colors[SIZE - i - 1][SIZE - j - 1];
                rotatedColors270[i][j] = colors[SIZE - j - 1][i];
            }
        }
    }
}
