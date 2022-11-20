public class User {
    public int age;
    public String name;
    public String surname;
    public String gender;

    public void setNameSurname(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int evaluateAge(int age) {
        ;
        int evaluateAge = age++;
        return evaluateAge;
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
}
