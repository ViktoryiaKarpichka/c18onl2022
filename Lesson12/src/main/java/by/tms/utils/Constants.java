package by.tms.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Constants {
    public static final int MIN_LOGIN_LENGTH = 3;
    public static final int MAX_LOGIN_LENGTH = 20;
    public static final String PATTERN_LOGIN =
            "\\w{3,20}";
    public static final int PASSWORD_LENGTH = 3;
    public static final int MAX_PASSWORD_LENGTH = 20;

    public static final String PATTERN_PASSWORD = "\\w{3,20}";
}

