public class User {
    public int age;
    public String name;
    public String surname;
    public String gender;


    public void setNameSurname() {
        this.name = name;
        this.surname = surname;
        System.out.println(name + " " + surname);
    }

    public void setAge(int age) {
        this.age = age;
        age++;
        System.out.println(age);
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sex='" + gender + '\'' +
                '}';
    }

    public User(int age, String name, String surname, String gender) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
