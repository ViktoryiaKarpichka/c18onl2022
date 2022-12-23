package by.tms.model;

import by.tms.services.TextFormatter;

public class TextHandler {
    private String string;

    public TextHandler(String string) {
        this.string = string;
    }

    public String outPutSentences() {
        StringBuilder newString = new StringBuilder();
        for (String str : TextFormatter.splitByPoint(string)) {
            String[] strings = string.split(" ");
            if (TextFormatter.checkForFiveWordsInSentence(strings) || TextFormatter.checkPalindromeInSentence(strings)) {
                newString.append(str).append(". ");
            }
        }
        return newString.toString();
    }
}