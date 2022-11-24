package com.learningJdbc.demoJdbc.dao;

import com.learningJdbc.demoJdbc.entity.User;

import java.util.List;

public interface UserRepository {
    void saveUser(User user);

    List<User> getAll();

    String deleteUser(int id);

    String updateUser(User user);
}
