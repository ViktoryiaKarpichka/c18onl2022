package by.tms.model;

import static org.apache.commons.lang3.StringUtils.split;

public class TextMethod {
    public static char[] cutOutStrings(String text) {
        int start = text.indexOf("а"); //не знаю, как быть с регистром и если нет таких букв? тогда выдает ошибку
        int end = text.lastIndexOf("в");
        char[] charText = new char[end - start];
        text.getChars(start, end, charText, 0);
        return charText;
    }

    public static int getCountOfWords(String text) {
        int count = text.split(" ").length;
        return count;
    }

    public static boolean checkReversWords(String text) {
        boolean isReversWord = false;
        String[] words = text.split(" ");
        for (String word : words) {
            if (new StringBuilder(word).reverse().toString().equals(word)) {
                isReversWord = true;
            }
        }
        return isReversWord;
    }

    // с этим методом запуталась, т к это воид и не знаю как передать строку для разделения на слова, ну и повторяющийся код
    public void getReversWords() {
        String[] words = split(" ");
        for (String word : words) {
            if (new StringBuilder(word).reverse().toString().equals(word)) {
                System.out.println(word);
            }
        }
    }

    //та же проблема
    public void replaceSymbolByIndex(String text) {
        String[] words = text.split(" ");
        for (String word : words) {
            System.out.println(word.replace(word.charAt(3), word.charAt(0)));
        }
    }

}
