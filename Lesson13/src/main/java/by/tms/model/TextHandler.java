package by.tms.model;

import by.tms.utils.TextFormatter;

public class TextHandler {
    private String string;

    public TextHandler(String string) {
        this.string = string;
    }

    public String getSentences() {
        StringBuilder newString = new StringBuilder();
        for (String str : TextFormatter.splitByPoint(string)) {
            String[] strings = string.split(" ");
            if (TextFormatter.checkCountWordsInSentence(strings) || TextFormatter.checkPalindromeInSentence(strings)) {
                newString.append(str).append(". ");
            }
        }
        return newString.toString();
    }
}