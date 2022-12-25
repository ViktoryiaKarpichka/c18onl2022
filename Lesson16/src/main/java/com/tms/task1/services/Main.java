package com.tms.task1.services;

import com.tms.task1.models.Data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//1) Список каталога
//        * Написать метод который циклически просматривает содержимое заданного каталога и выводит на печать информацию о всех файлах и каталогах, находящихся в нем и в его подкаталогах.
//        * Используем рекурсию.
public class Main {
    public static void main(String[] args) {
        //не знаю как эту задачу решать, просто практикую создание списка
        List<Data> objects = new ArrayList<>();
        objects.add(new Data("0"));
        objects.add(new Data("1"));
        objects.add(new Data("2"));
        Iterator<Data> iterator = objects.iterator();
        while (iterator.hasNext()) {
            iterator.next().printInfo();
        }
    }
}
