import java.util.Arrays;
import java.util.Scanner;
//Создайте массив целых чисел. Напишете программу, которая выводит
  //      сообщение о том,
    //    Пусть число для поиска задается с консоли (класс Scanner).
public class Lesson8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        int[] massive = new int[10];
        for (int i = 0; i < massive.length; i++) {
            massive[i]=i;
        }
        boolean checkNumberInArray = checkNumberInArray(number, massive);
        System.out.println(checkNumberInArray ? "Число входит" : "Число не входит");
        System.out.println(Arrays.toString(massive));
    }

    private static boolean checkNumberInArray(int number, int[] massive) {
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] == number) {
                return true;
            }
        }
        return false;
    }
}
