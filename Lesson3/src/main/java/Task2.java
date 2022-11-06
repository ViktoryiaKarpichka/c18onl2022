import java.util.Scanner;

//2)Проверка четности числа
//Создать программу, которая будет сообщать, является ли целое число, введённое пользователем,
// чётным или нет. Ввод числа осуществлять с помощью класса Scanner.
// Если пользователь введёт не целое число, то сообщать ему об ошибке.
public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        if (console.hasNextInt()) {
            int numb = console.nextInt();
            if (numb % 2 == 0) {
                System.out.println("Введенное число четное");
            } else {
                System.out.println("Введенное число  не четное");
            }
        } else {
            System.out.println("Ошибка. Введено не целое число");
        }
    }
}
