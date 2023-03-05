package com.tms.utils;

import com.tms.exeptions.RequestParamNullException;
import lombok.experimental.UtilityClass;

@UtilityClass
public class HttpRequestParamValidator {

    private static final String REQUEST_PARAMETER_IS_NULL_ERROR = "Request parameter is not initialized!";

    public static void validateParamNotNull(String param) throws RequestParamNullException {
        if (param == null) {
            throw new RequestParamNullException(REQUEST_PARAMETER_IS_NULL_ERROR);
        }
    }
}
