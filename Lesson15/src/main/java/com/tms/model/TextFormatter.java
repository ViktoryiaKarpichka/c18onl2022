package com.tms.model;

public abstract class TextFormatter {
    public String[] splitByPoint(String string) {
        return string.split("\\. ");
    }

    public boolean checkSentence(String[] strings) {
        return strings.length >= 3 && strings.length <= 5;
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
