import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import static java.lang.System.setIn;
/**
 * Шаги по реализации:
 * - Прочитать два int из консоли
 * - Создайте двумерный массив int (используйте целые числа, которые вы читаете по высоте и ширине консоли)
 * - Заполнить массив случайными значениями (до 100)
 * - Вывести в консоль матрицу заданного размера, но:
 * - Если остаток от деления элемента массива на 3 равен нулю - выведите знак "+" вместо значения элемента массива.
 * - Если остаток от деления элемента массива на 7 равен нулю - выведите знак "-" вместо значения элемента массива.
 * - В противном случае выведите "*"
 * <p>
 * Example:
 * - Значения с консоли - 2 и 3
 * - Массив будет выглядеть так (значения будут разными, потому что он случайный)
 * 6 11 123
 * 1 14 21
 * - Для этого значения вывод в консоли должен быть:
 * <p>
 * + * *
 * * - +
 * <p>
 * Обратите внимание, что 21% 3 == 0 и 21% 7 = 0, но выводить надо не +-, а +
 */
public class Task14 {
        public static void main(String[] args) {
                int length = 0;
                int weight = 0;
                while (true) {
                        Scanner cons = new Scanner(System.in);
                        if (cons.hasNextInt()) {
                                length = cons.nextInt();
                                weight = cons.nextInt();
                                if (length > 0 && weight > 0) {
                                        break;
                                }
                        }
                }
                Random random = new Random();
                int[][] massive = new int[length][weight];
                for (int i = 0; i < massive.length; i++) {
                        for (int j = 0; j < massive[i].length; j++) {
                                massive[i][j] = random.nextInt(101);
                                System.out.printf("%2d ",massive[i][j]);
                        }
                        System.out.println();
                }

        }
}
