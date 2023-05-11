package com.tms.controller;

import static com.tms.model.PagesPath.PROFILE_PAGE;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @GetMapping
    public ModelAndView openProfilePage() {
        return new ModelAndView(PROFILE_PAGE.getPath());
    }
}
