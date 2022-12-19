package by.tms.services;

public interface AuthenticationService {

    boolean checkAuthorization(String login, String password, String confirmPassword) throws Exception;
}
