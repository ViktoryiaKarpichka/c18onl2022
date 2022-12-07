package by.tms.services;

import by.tms.model.Jacket;
import by.tms.model.Pants;
import by.tms.model.Person;
import by.tms.model.Shoes;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ivan", new Shoes(), new Jacket(), new Pants());
        System.out.println(person.getName());
        person.putOn();
        person.takeOff();
    }
}
