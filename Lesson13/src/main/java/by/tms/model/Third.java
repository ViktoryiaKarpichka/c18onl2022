package by.tms.model;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Third {
    //    3) В массиве находятся слова. Вывести на экран слова палиндромы
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("шалаш");
        strings.add("стол");
        strings.add("казак");
        strings.add("дед");
        strings.add("стул");
        strings.add("машина");

        System.out.println(outputPalindromes(strings));
    }

    private static List<String> outputPalindromes(List<String> strings) {
//        strings.removeIf(temp -> !temp.equalsIgnoreCase(StringUtils.reverse(temp)));
        List<String> result = new ArrayList<>();
        for (String string : strings) {
            //new StringBuilder(str).reverse().toString()
            if (string.equalsIgnoreCase(StringUtils.reverse(string))) {
                result.add(string);
            }
        }
        return result;
    }
}
