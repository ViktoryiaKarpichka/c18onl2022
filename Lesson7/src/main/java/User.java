public class User {
    public int age;
    public String name;
    public String surname;
    public String gender;

    public User() {
    }

    public User(int age, String name, String surname, String gender) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    private User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public User(String gender) {
        this("Anna", "Petrova");
        this.gender = gender; // когда удаляю эту строку, то пол генерится null. Почему так? В скобку выше не записывает-ошибка
    }

    public void printNameSurname() {
        System.out.println(name + " " + surname);
    }

    @Deprecated
    public void evaluateAge(int age) {
        this.age = ++age;
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
}
