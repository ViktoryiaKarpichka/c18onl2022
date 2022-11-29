package by.tms.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Person {
   private String name;
   private int age;
   private String gender;
   private Address address;

   public Person(String name, int age, String gender, Address address) {
      this.name = name;
      this.age = age;
      this.gender = gender;
      this.address = address;
   }

}
