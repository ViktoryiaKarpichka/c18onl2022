package by.tms.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class TextFormatter {
    public static final int MIN_COUNT_WORDS = 3;
    public static final int MAX_COUNT_WORDS = 5;

    public static String[] splitByPoint(String string) {
        return string.split("\\.\s* ");
    }

    public static boolean checkCountWordsInSentence(String[] strings) {
        return strings.length >= MIN_COUNT_WORDS && strings.length <= MAX_COUNT_WORDS;
    }

    public static boolean checkPalindromeInSentence(String[] strings) {
        for (String str : strings) {
            if (str.equalsIgnoreCase(new StringBuilder(str).reverse().toString())) {
                return true;
            }
        }
        return false;
    }
}
