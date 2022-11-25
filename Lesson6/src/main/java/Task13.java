import java.util.Arrays;
import java.util.Random;

/**
 * заполнить рандомно 2-х мерный массив и посчитать сумму элементов на диагонали
 */
public class Task13 {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j]= random.nextInt(101);
            }
        }
        System.out.println(Arrays.deepToString(array));
        int summa = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    summa += array[i][j];
                }
            }
        }
        System.out.println(summa);
        for (int i = 0; i < array.length; i++) {
            summa += array[i][i];
        }
        System.out.println(summa/2);
    }
}
