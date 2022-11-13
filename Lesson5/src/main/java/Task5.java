//        5) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
//        умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.
public class Task5 {
    public static void main(String[] args) {
        System.out.println(summ(2, -3));
    }

    private static int summ(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        boolean negative = false;
        if (a < 0) {
            negative = true;
            a = -a;
        }
        if (b < 0) {
            negative = true;
            b = -b;
        }
        int summ = 0;
        for (int i = 1; i <= a; i++) {
            summ += b;
        }
        return negative ? -summ : summ;
    }
}


