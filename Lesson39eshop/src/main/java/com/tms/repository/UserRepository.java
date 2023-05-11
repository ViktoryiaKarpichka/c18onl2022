package com.tms.repository;

import com.tms.model.User;
import java.util.List;

public interface UserRepository {

    User findById(int id);

    List<User> getUser();

    User findByEmailAndPassword(String email, String password);

}
