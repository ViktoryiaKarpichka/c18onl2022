//        11) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
//        Пример: {0,3,46,3,2,1,2}
//        Массив имеет повторяющиеся элементы 3, 2
//        Пример: {0,34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов
public class Task11 {
    public static void main(String[] args) {
        arrayElements(new int[]{1, 2, 3, 4, 5, 4});
    }

    private static void arrayElements(int[] array) {
        System.out.print("Array has duplicate elements: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[j] + " ");
                }
            }
        }
    }
}


