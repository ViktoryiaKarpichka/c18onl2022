package by.tms.services;

import java.time.LocalDate;

public class Task1 {
    public static void main(String[] args) {
        // * 1. Написать программу для вывода на консоль названия дня недели по введенной дате.
        LocalDate localDate = LocalDate.of(1992, 11, 11);
        System.out.println(localDate.getDayOfWeek());
    }
}
