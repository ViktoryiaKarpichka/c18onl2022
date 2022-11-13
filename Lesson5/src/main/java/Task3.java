//3) В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"
public class Task3 {
    public static void main(String[] args) {
        int number = 17;
        if (number > 0) {
            System.out.printf("%d - это положительное число, количество цифр = %s%n", number, (int) (Math.log10(number) + 1));
        } else if (number < 0) {
            System.out.printf("%d - это отрицательное число, количество цифр = %s%n", number, (int) (Math.log10(-number) + 1));
        } else {
            System.out.println("Число 0 состоит из 1 цифры и не является ни положительным, ни отрицательным");
        }
    }
}
