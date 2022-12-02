package by.tms.services;

import by.tms.model.Address;
import by.tms.model.MilitaryOffice;
import by.tms.model.Person;
import by.tms.model.PersonRegistry;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[15];
        persons[0] = new Person("Igor", 31, "male", new Address("Belarus", "Grodno"));
        persons[1] = new Person("Alexandr", 18, "male", new Address("Belarus", "Minsk"));
        persons[2] = new Person("Andrei", 54, "male", new Address("Belarus", "Mogilev"));
        persons[3] = new Person("Viktor", 25, "male", new Address("Belarus", "Gomel"));
        persons[4] = new Person("Pavel", 15, "male", new Address("Belarus", "Minsk"));
        persons[5] = new Person("Nikolai", 45, "male", new Address("Belarus", "Mogilev"));
        persons[6] = new Person("Mihail", 19, "male", new Address("Belarus", "Minsk"));
        persons[7] = new Person("Semen", 67, "male", new Address("Belarus", "Minsk"));
        persons[8] = new Person("Alexandr", 28, "male", new Address("Belarus", "Vitebsk"));
        persons[9] = new Person("Marat", 36, "male", new Address("Belarus", "Gomel"));
        MilitaryOffice militaryOffice = new MilitaryOffice(new PersonRegistry(persons));
        Person[] recruitsName = militaryOffice.checkNameRecruits("Alexandr");
        System.out.println(Arrays.toString(recruitsName));
    }
}
