package com.learningJdbc.demoJdbc.controller;

import com.learningJdbc.demoJdbc.entity.User;
import com.learningJdbc.demoJdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public void saveData(User user){
        userService.saveUser(user);
    }

    @GetMapping("/showUsers")
    public List<User> showAll(){
        return userService.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id){
       return userService.delete(id);
    }

    @PutMapping("/save")
    public String updateUser(@RequestBody User user){
        return userService.update(user);
    }
}
