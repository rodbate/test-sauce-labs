package com.test.controller;

import com.test.entity.User;
import com.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rodbate on 2015/10/23.
 */

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public User register(@RequestBody User user){
        /*User u = new User();
        u.setId(-1);
        u.setUsername(user.getUsername());
        u.setPassword(user.getPassword());*/
        return userRepository.save(user);
    }
}
