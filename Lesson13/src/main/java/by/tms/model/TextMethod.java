package by.tms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.apache.commons.lang3.StringUtils.isNotEmpty;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class TextMethod {
    public String cutOutStrings(String text) {
        return text.substring(text.indexOf("а"), text.lastIndexOf("в"));
    }

    public void replaceSymbolByIndex(String text) {
        String[] words = text.split(" ");
        for (String word : words) {
            if (word.length() > 4) {
                System.out.println(word.replace(word.charAt(3), word.charAt(0)));
            }
        }
    }

    public void printPalindrome(String text) {
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (checkPalindrome(words[i])) {
                System.out.println(words[i]);
            }
        }
        System.out.println();
    }

    // После запуска программы на экран должны выводиться только те предложения в которых от 3-х до 5-и слов.
    // Ничего не приходит в голову
    public void printSentences(String text) {
        String[] words = text.split("\\.");
        for (int i = 0; i < words.length; i++) {
            if (words[i].split(" ").length >= 3 && words[i].split(" ").length <= 5 || checkPalindrome(words[i])) {
                System.out.println(words[i]);
            }
        }
    }

    public int getCountOfWords(String text) {
        int count = text.split(" ").length;
        return count;
    }

    public boolean checkPalindrome(String text) {
        return new StringBuilder(text).reverse().toString().equals(text);
    }

    public String getTwoMediumSymbol(String text) {
        String mediumSymbol;
        if (isNotEmpty(text) && text.length() % 2 == 0) {
            mediumSymbol = text.substring(text.length() / 2 - 1, text.length() / 2 + 1);
        } else {
            mediumSymbol = "odd number of letters";
        }
        return mediumSymbol;
    }

    public int getCountLatinAlphabet(String text) {
        String[] words = text.split(" ");
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher;
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            matcher = pattern.matcher(words[i]);
            if (matcher.matches()) {
                count++;
            }
        }
        return count;
    }
}
