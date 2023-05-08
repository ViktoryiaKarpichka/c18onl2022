package com.tms.service;

import com.tms.exeptions.AuthorizationException;
import com.tms.model.User;
import java.util.List;
import org.springframework.web.servlet.ModelAndView;

public interface UserService {

    ModelAndView authenticate(User user) throws AuthorizationException;

    List<User> read();
}
