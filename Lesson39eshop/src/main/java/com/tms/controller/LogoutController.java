package com.tms.controller;

import static com.tms.model.PagesPath.SIGN_IN_PAGE;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/logout")
public class LogoutController {

    @GetMapping()
    public ModelAndView openLogOutPage() {
        return new ModelAndView(SIGN_IN_PAGE.getPath());
    }
}
