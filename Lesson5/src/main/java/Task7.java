import java.util.Arrays;

//        7) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
//        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).
public class Task7 {
    public static void main(String[] args) {
        int[] array = new int[50];
        for (int i = 0, j = 0; i < 100; i++) {
            if (i % 2 != 0) {
                array[j] = i;
                j++;
            }
        }
        System.out.println(Arrays.toString(array));
        int[] arraySecond = new int[array.length];
        System.arraycopy(array, 0, arraySecond, 0, 50);
        int[] reversArray = new int[arraySecond.length];
        for (int i = arraySecond.length - 1, j = 0; i >= 0; i--) {
            reversArray[j++] = arraySecond[i];
        }
        System.out.println(Arrays.toString(reversArray));
    }
}



