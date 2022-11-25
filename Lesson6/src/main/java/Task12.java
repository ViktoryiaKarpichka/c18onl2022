import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.setIn;

//        Создаём квадратную матрицу, размер вводим с клавиатуры.
//        Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//        Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)

public class Task12 {
    public static void main(String[] args) {
        int number;
        while (true) {
            Scanner console = new Scanner(System.in);
            if (console.hasNextInt()) {
                number = console.nextInt();
                if (number > 0) {
                    break;
                }
            }
            System.out.println("Enter the number");
        }
        int[][] matrix = new int[number][number];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(51);
                System.out.printf("%2d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        transpose(matrix);
    }

    private static void transpose(int matrix[][]) {
        int[][] transposedMatrix= new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix.length; j++) {
                System.out.printf("%2d ",transposedMatrix[i][j]);
            }
            System.out.println();
        }
    }
}




