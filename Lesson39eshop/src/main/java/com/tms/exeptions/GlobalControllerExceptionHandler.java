package com.tms.exeptions;

import static com.tms.model.PagesPath.ERROR_PAGE;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@ControllerAdvice
public class GlobalControllerExceptionHandler {

    @ExceptionHandler(AuthorizationException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ModelAndView handlerException(AuthorizationException e) {
        //на error.jsp не выводится ошибка, хотя по дебагу все передается(текст любой могу отобразить)
        //в консоли выводит только "AuthException"
        log.error("AuthException", e.getMessage());
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("error", e.getMessage());
        ModelAndView model = new ModelAndView();
        model.setViewName(ERROR_PAGE.getPath());
        model.addObject(modelMap);
        return model;
    }
}
