package com.example.controller;

import com.example.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nick on 2017/3/18.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/all")
    public List<User> getAllUsers() {
        User user = new User();
        user.setUserId(123L);
        user.setUserName("Nick");
        List<User> users = new ArrayList<>();
        users.add(user);
        return users;
    }

}
