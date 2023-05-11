package com.tms.repository.impl;

import static com.tms.utils.Utils.users;

import com.tms.model.User;
import com.tms.repository.UserRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Override
    public List<User> getUser() {
        return new ArrayList<>(users);
    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public User findByEmailAndPassword(String email, String password) {
        return users.stream()
                    .filter(user -> user.getEmail().equalsIgnoreCase(email))
                    .filter(user -> user.getPassword().equalsIgnoreCase(password))
                    .findAny()
                    .orElse(null);
    }

}
