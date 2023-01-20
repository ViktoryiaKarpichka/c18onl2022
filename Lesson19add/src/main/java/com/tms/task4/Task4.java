package com.tms.task4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import static java.util.Comparator.comparing;

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

        System.out.println(getSortedCategories(categories, comparing(Product::getName).reversed()));
        System.out.println(getSortedCategories(categories, comparing(Product::getPrice)));
        System.out.println(getSortedCategories(categories, comparing(Product::getRate)));
    }

    private static List<Product> getSortedCategories(List<Category> categories, Comparator<Product> categoryComparator) {
        return categories.stream()
                .flatMap(category -> category.getProducts().stream())
                .sorted(categoryComparator)
                .toList();
    }
}
