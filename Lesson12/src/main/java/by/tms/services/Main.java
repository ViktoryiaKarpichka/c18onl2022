package by.tms.services;

public class Main {
    public static void main(String[] args) {
        try {
            checkAuthorization("Ivan_1", "Petrov_12345678910", "Petrov_1234567891");
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
            ;
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkAuthorization(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() < 20 && password.length() < 20 && password.equals(confirmPassword)) {
            System.out.println("Authorization was successful");
        } else if (login.length() >= 20) {
            throw new WrongLoginException("Invalid login");
        } else if (password.length() >= 20 || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Invalid password");
        }
    }
}
