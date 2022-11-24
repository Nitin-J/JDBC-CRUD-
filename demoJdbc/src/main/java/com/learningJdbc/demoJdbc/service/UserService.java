package com.learningJdbc.demoJdbc.service;

import com.learningJdbc.demoJdbc.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    List<User> getAll();

    String delete(int id);

    String update(User user);
}
