package com.tms.task1;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        // 1)Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5".
        //         Избавиться от повторяющихся элементов в строке и вывести результат на экран.
        Scanner console = new Scanner(System.in);
        {
            Set<String> numbers = new HashSet<>(Arrays.asList(console.nextLine().split(" ")));
            System.out.println(numbers);
        }
        {
            List<String> numbers = Arrays.asList(console.nextLine().split(" "));
            System.out.println(new HashSet<>(numbers));
        }
    }
}
