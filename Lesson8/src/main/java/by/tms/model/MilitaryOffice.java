package by.tms.model;

public class MilitaryOffice {
    private PersonRegistry personRegistry;

    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }

    public int countRecruits() {
        int countRecruits = 0;
        for (Person person : personRegistry.getPersons()) {
            if (checkRecruits(person)) {
                countRecruits++;
            }
        }
        return countRecruits;
    }

    private static boolean checkRecruits(Person person) {
        return person.getAge() >= 18 && person.getAge() <= 27 && person.getGender().equals("male");
    }

    public Person[] checkNameRecruits(String name) {
        Person[] persons = personRegistry.getPersons();
        Person[] personName = new Person[persons.length];
        for (int i = 0; i < persons.length; i++) {
            Person person = persons[i];
            if (checkRecruits(person) && person.getName().equalsIgnoreCase("Aleksandr")) {
                personName[i] = person;
            }
        }
        return personName;
    }
}
