package by.tms.services;

import by.tms.models.OneMethod;

public class Task3 {
    public static void main(String[] args) {
//* 3. Создать обобщенный функциональный интерфейс.
//     * Написать класс с одним методом.
//     * В этом методе реализуйте логику:
//     * - если в консоль введена цифра 1, то: использования интерфейса со
//     * строковым типом и передать в метод интерфейса логику реверса
//     * строки(вывода строки в обратном порядке).
//     * - если в консоль введена цифра 2, то: использования интерфейса с
//     * целочисленным типом и передать в метод интерфейса логику
//     * нахождения факториала числа.
        try {
            System.out.println("Enter the number 1 or 2");
            new OneMethod().chooseNumberForOperation();
        } catch (Exception exception) {
            System.out.println("Incorrect data");
        }

    }
}
