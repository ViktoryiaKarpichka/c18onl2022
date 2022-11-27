public class Main {
    public static void main(String[] args) {
        User user = new User(35, "Ivan", "Ivanov", "male");
        System.out.println(user);
        user.printNameSurname();
        User user1 = new User();
        user1.name = "Tim";
        user1.age = 30;
        user1.surname = "Novak";
        user1.gender = "male";
        user1.evaluateAge(30);
        System.out.println(user1);
        // User user2 = new User("Petr", "Petrov");
        //System.out.println(user2);
        User anna = new User("женский");
        System.out.println(anna.getName());
        System.out.println(anna.getSurname());
        System.out.println(anna);
    }
}
