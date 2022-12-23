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
    //    1) Вырезать подстроку из строки начиная с первого вхождения символа(А) до, последнего вхождения сивола(B).
    public String cutOutStrings(String text) {
        return text.substring(text.indexOf("а"), text.lastIndexOf("в") + 1);
    }

    //    2) Заменить все вхождения символа стоящего в позиции (3) на символ стоящий в позиции 0
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

    public void printSentences(String text) {
        String[] words = text.split("\\.");
        for (int i = 0; i < words.length; i++) {
            int word = words[i].split(" ").length;
            if (word >= 3 && word < 5 || checkPalindrome(words[i])) {
                System.out.println(words[i]);
            }
        }
    }

    //* 1. Метод принимает строку и возвращает кол-во слов в строке.
    public int getCountOfWords(String text) {
        int count = text.split(" ").length;
        return count;
    }

    //* 2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если есть возвращает true, если нет false
    public boolean checkPalindrome(String text) {
        return new StringBuilder(text).reverse().toString().equals(text);
    }

    //    5)Даны строки разной длины (длина - четное число), необходимо вернуть ее два средних знака:
//            * Пример: "string" → "ri", "code" → "od", "Practice"→"ct".
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
