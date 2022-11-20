public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.evaluateAge(34);
        user1.setGender("male");
        user1.setAge(78);
        user1.setNameSurname("Ivan", "Ivanov");
        System.out.println(user1);
        User user2 = new User();
        user2.setNameSurname("Petr", "Petrov");
        System.out.println(user2);
    }
}
