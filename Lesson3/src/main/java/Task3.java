import java.util.Scanner;

//3) Меньшее по модулю число
//Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых
// пользователем вещественных чисел с консоли.
public class Task3 {
    public static void main(String[] args) {
        Scanner cons = new Scanner(System.in);
        double number = cons.nextDouble();
        double number1 = cons.nextDouble();
        double number2 = cons.nextDouble();
        double max = Math.max(Math.abs(number), Math.max(Math.abs(number1), Math.abs(number2)));
        System.out.println(max);
    }
}
