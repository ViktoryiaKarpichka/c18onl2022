package by.tms.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public void printStringTask2() {
        String text = "cab, ccab, cccab";
        Pattern pattern = Pattern.compile("c.+?b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public void printStringTask3() {
        //может по-другому надо
        String text = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
        Pattern pattern = Pattern.compile("Java\\s* \\d");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }


    public void getCountLatinSymbol() {
        // не совсем понимаю как сделать
        String str = "One two three раз два три one1 two2 123";
        System.out.println(str.split("[a-zA-z]+").length);
    }

    public static boolean validate(String str) {
        return Pattern.matches("([a-z]+)([1|5)])", str) && str.length() >= 4 && str.length() <= 20;
    }
}
