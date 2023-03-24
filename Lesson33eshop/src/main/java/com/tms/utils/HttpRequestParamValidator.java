package com.tms.utils;

import com.tms.exeptions.ValidationException;
import java.util.Optional;
import lombok.experimental.UtilityClass;

@UtilityClass
public class HttpRequestParamValidator {

    private static final String REQUEST_PARAMETER_IS_NULL_ERROR = "Request parameter is not initialized!";

    public static void validateParamNotNull(String param) throws ValidationException {
        if (Optional.ofNullable(param).isEmpty()) {
            throw new ValidationException(REQUEST_PARAMETER_IS_NULL_ERROR);
        }
    }
}
