package com.tms.service.impl;

import static com.tms.model.PagesPath.HOME_PAGE;

import com.tms.exeptions.AuthorizationException;
import com.tms.model.Category;
import com.tms.model.User;
import com.tms.repository.UserRepository;
import com.tms.service.CategoryService;
import com.tms.service.UserService;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final CategoryService categoryService;

    @Override
    public ModelAndView authenticate(User user) throws AuthorizationException {
        ModelAndView modelAndView = new ModelAndView();
        User loggedUser = userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
        if (Optional.ofNullable(loggedUser).isPresent()) {
            ModelMap modelMap = new ModelMap();
            List<Category> categoriesList = categoryService.getCategories();
            modelMap.addAttribute("categories", categoriesList);
            modelAndView.setViewName(HOME_PAGE.getPath());
            modelAndView.addAllObjects(modelMap);
        } else {
            throw new AuthorizationException("User is not authorized! Please, try again!");
            // modelAndView.setViewName(SIGN_IN_PAGE.getPath());
        }
        return modelAndView;
    }

    @Override
    public List<User> read() {
        return userRepository.getUser();
    }
}
