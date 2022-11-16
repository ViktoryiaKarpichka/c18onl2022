import java.util.Arrays;
import java.util.Random;

//9) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
// Выведите массив на экран в строку.
// Замените каждый элемент с нечётным индексом на ноль.
//Снова выведете массив на экран на отдельной строке.
public class Task9 {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
