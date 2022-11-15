//        8) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10

import java.util.Arrays;
import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        int[] mass = new int[12];
        Random random = new Random();
        int maxValue = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(16);
        }
        System.out.println(Arrays.toString(mass));
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > maxValue) {
                maxValue = mass[i];
                maxIndex = i;

            }
        }
        System.out.println("Максимальный элемент " + maxValue + " Индекс вхождения в массив " + maxIndex);
    }
}
