package com.tms.utils;


public class TextFormatter {
    public static final int MIN_COUNT_WORDS = 3;
    public static final int MAX_COUNT_WORDS = 5;

    public String[] splitByPoint(String string) {
        return string.split("\\. ");
    }

    public boolean checkSentence(String[] strings) {
        return strings.length >= MIN_COUNT_WORDS && strings.length <= MAX_COUNT_WORDS;
    }

    public boolean checkPalindrome(String[] strings) {
        for (String str : strings) {
            if (str.equalsIgnoreCase(new StringBuilder(str).reverse().toString())) {
                return true;
            }
        }
        return false;
    }
}
