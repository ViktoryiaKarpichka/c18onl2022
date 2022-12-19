package by.tms.services;

import by.tms.exception.WrongLoginException;
import by.tms.exception.WrongPasswordException;

import static by.tms.utils.Constants.PATTERN_LOGIN;
import static by.tms.utils.Constants.PATTERN_PASSWORD;

public class AuthenticationServiceImpl implements AuthenticationService {

    @Override
    public boolean checkAuthorization(String login, String password, String confirmPassword) throws Exception {
        if (!login.matches(PATTERN_LOGIN)) {
            throw new WrongLoginException("Incorrect data entered in the LOGIN field");
        }
        if (!password.matches(PATTERN_PASSWORD)) {
            throw new WrongPasswordException("Incorrect data entered in the PASSWORD field");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Passwords do not match");
        }
        return true;
    }
}

