package com.tms.controller;

import static com.tms.model.PagesPath.SIGN_IN_PAGE;

import com.tms.exeptions.AuthorizationException;
import com.tms.model.User;
import com.tms.service.UserService;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@RequiredArgsConstructor
@RestController
@SessionAttributes({"user"})
@RequestMapping("/login")
public class AuthController {

    private final UserService userService;

    @GetMapping
    public ModelAndView openLoginPage() {
        return new ModelAndView(SIGN_IN_PAGE.getPath());
    }

   // @ErrorView(value = "error", status = HttpStatus.FORBIDDEN)
   @PostMapping
   public ModelAndView login(@ModelAttribute("user") @Valid User user, BindingResult bindingResult, ModelAndView modelAndView) throws AuthorizationException {
       if (bindingResult.hasErrors()) {
           populateError("email", modelAndView, bindingResult);
           populateError("password", modelAndView, bindingResult);
           modelAndView.setViewName(SIGN_IN_PAGE.getPath());
           return modelAndView;
       }

       return userService.authenticate(user);
   }

    @ModelAttribute("user")
    public User setUpUserForm() {
        return new User();
    }

    private void populateError(String field, ModelAndView modelAndView, BindingResult bindingResult) {
        FieldError fieldError = bindingResult.getFieldError(field);
        if (fieldError != null) {
            modelAndView.addObject(field + "Error", fieldError.getDefaultMessage());
        }
    }
}
