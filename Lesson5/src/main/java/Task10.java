import java.util.Arrays;

//        10) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом
public class Task10 {
    public static void main(String[] args) {
        int[] array = {4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        int maxValue = array[0];
        int indexMaxValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                indexMaxValue = i;
            }
        }
        System.out.println("Max array element: " + maxValue);
        System.out.println("Index of the max array element: " + indexMaxValue);
        int temp = array[0];
        array[0] = maxValue;
        array[indexMaxValue] = temp;
        System.out.println(Arrays.toString(array));
    }
}
