package by.tms.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PersonRegistry {
    private Person[] persons;

    public PersonRegistry(Person[] persons) {
        this.persons = persons;
    }

    public Person[] getPersons() {
        return persons;
    }
}
