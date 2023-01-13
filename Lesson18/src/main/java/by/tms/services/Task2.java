package by.tms.services;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Task2 {
    public static void main(String[] args) {
        //* 2. Написать программу для вывода на экран дату следующего вторника.
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));
    }
}
