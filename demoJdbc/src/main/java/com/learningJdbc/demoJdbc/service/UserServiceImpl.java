package com.learningJdbc.demoJdbc.service;

import com.learningJdbc.demoJdbc.dao.UserRepository;
import com.learningJdbc.demoJdbc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public void saveUser(User user) {
        userRepository.saveUser(user);
    }

    @Override
    public List<User> getAll() {
        return userRepository.getAll();
    }

    @Override
    public String delete(int id) {
        return userRepository.deleteUser(id);
    }

    @Override
    public String update(User user) {
        return userRepository.updateUser(user);
    }
}
