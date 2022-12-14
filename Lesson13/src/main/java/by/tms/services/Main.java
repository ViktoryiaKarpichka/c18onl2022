package by.tms.services;

import static by.tms.model.TextMethod.*;

public class Main {
    public static void main(String[] args) {
        String text = "Мой дед попросил сделать заказ. Однако, был уже поздний вечер.";

        System.out.println(getCountOfWords(text));
        System.out.println(cutOutStrings(text));
        System.out.println(checkReversWords(text));
        System.out.println();
    }
}
