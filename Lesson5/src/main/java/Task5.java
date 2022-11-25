//        5) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
//        умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.
public class Task5 {
    public static void main(String[] args) {
        System.out.println(summ(-2, -3));
    }
    public static int summ(int a, int b) {
        int absA = Math.abs(a);
        int absB = Math.abs(b);
        int result = 0;
        if (absA == 0 || absB == 0) {
            return result;
        }
        if (absA > absB) {
            result = multi(absA, absB);
        } else {
            result = multi(absB, absA);
        }
        if (a < 0 && b > 0 || b < 0 && a > 0) {//a < 0 ^ b > 0
            return -result;
        }
        return result;
    }
    private static int multi(int a, int b) {
        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum += a;
        }
        return sum;
    }
    public static int fission(int start, int time) {
        return (int) (start * Math.pow(2, time / 3));
    }
}


