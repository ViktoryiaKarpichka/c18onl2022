package com.tms.controller;

import static com.tms.model.PagesPath.HOME_PAGE;

import com.tms.model.Category;
import com.tms.model.User;
import com.tms.service.CategoryService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

@Setter
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/home")
public class HomeController {

    private final CategoryService categoryService;

    @GetMapping
    public ModelAndView openHomePage(@SessionAttribute("user") User user) {
        System.out.println("User with email: " + user.getEmail() + " and password: " + user.getPassword() + " successfully logged in!");
        ModelMap model = new ModelMap();
        List<Category> categoriesList = categoryService.getCategories();
        model.addAttribute("categories", categoriesList);
        return new ModelAndView(HOME_PAGE.getPath(), model);
    }
}
