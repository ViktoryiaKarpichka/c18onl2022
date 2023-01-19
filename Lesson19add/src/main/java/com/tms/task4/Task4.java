package com.tms.task4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
        // 4) Создать класс Товар, имеющий переменные имя, цена, рейтинг.
        //         Создать класс Категория, имеющий переменные имя и множество товаров.
        //         Создать несколько объектов класса Категория.
        //         Создать метод, распечатывающий товары каталога, отсортированные по имени, цене или рейтингу.
        //        Используем классы компараторы для каждого вида сортировки.
        Category electronics = new Category("Electronics", Set.of(
                new Product("TV", 550, 2),
                new Product("phone", 1000, 1),
                new Product("refrigerator", 700, 3)));
        Category clothes = new Category("Clothes", Set.of(
                new Product("coat", 100, 3),
                new Product("pants", 50, 2),
                new Product("sweater", 30, 4)));
        Category furniture = new Category("Furniture", Set.of(
                new Product("table", 200, 3),
                new Product("sofa", 270, 1),
                new Product("armchair", 50, 4)));

        List<Category> categories = Arrays.asList(furniture, clothes, electronics);
        categories.stream()
                .flatMap(category -> category.getProducts().stream())
                .sorted(Comparator.comparing(Product::getPrice))
                .forEach(System.out::println);

        categories.stream()
                .flatMap(category -> category.getProducts().stream())
                .sorted(Comparator.comparing(Product::getName))
                .forEach(System.out::println);

        compareByRate(categories);
        // можно ли сделать так, чтоб для всех параметров подходило, так сказать, перегрузить?
    }

    private static void compareByRate(List<Category> categories) {
        categories.stream()
                .flatMap(category -> category.getProducts().stream())
                .sorted(Comparator.comparing(Product::getRate))
                // .sorted(Comparator.comparing(Product::getPrice)) // eсли в таком порядке написать,сортирует по цене
                // .sorted(Comparator.comparing(Product::getName))
                .forEach(System.out::println);
    }
}
