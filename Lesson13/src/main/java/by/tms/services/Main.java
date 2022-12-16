package by.tms.services;

import by.tms.model.Employee;
import by.tms.model.TextMethod;

public class Main {
    public static void main(String[] args) {
        String n = "kazaki";
        String text = "Мой дед попросил сделать заказ для него. Однако, был уже поздний вечер.";
        String text2 = "Методы доступа называют ещё аксессорами (от англ. access — доступ), или по отдельности — геттерами (англ. get — чтение) and сеттерами (англ. set — запись)";
        TextMethod textMethod = new TextMethod();
        System.out.println(textMethod.cutOutStrings(text));
        textMethod.replaceSymbolByIndex(text);
        textMethod.printPalindrome(text);
        System.out.println(textMethod.checkPalindrome(text));
        System.out.println(textMethod.getCountOfWords(text));
        System.out.println(textMethod.getTwoMediumSymbol(n));
        System.out.println(textMethod.getCountLatinAlphabet(text2));

        Employee[] employee = new Employee[5];
        employee[0] = new Employee("A.S. Petrov", 2500.00);
        employee[1] = new Employee("D.K. Sidorov", 2300.500);
        employee[2] = new Employee("P.L. Ivanova", 1900.688);
        employee[3] = new Employee("D.K. Kovaleva", 2680.900);
        employee[4] = new Employee("D.K. Zhdanov", 2700.598);
        for (Employee employer : employee) {
            employer.generateReport();
        }
    }

}
