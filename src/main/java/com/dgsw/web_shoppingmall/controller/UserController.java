package com.dgsw.web_shoppingmall.controller;

import java.util.List;

import com.dgsw.web_shoppingmall.domain.User;
import com.dgsw.web_shoppingmall.service.interfaces.UserService;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/api/user/id")
    public User findById(@Param("id") long id) {
        return userService.findById(id);
    }

    @GetMapping(value = "/api/user/accout")
    public User findByAccount(@Param("account") String account) {
        return userService.findByAccount(account);
    }

    @GetMapping(value = "/api/user")
    public List<User> findAll() {
        return userService.findAll();
    }

    @PostMapping(value = "/api/user")
    public long add(@RequestBody User user) {
        return userService.add(user);
    }

    @PutMapping(value = "/api/user")
    public int modify(@RequestBody User user) {
        return userService.modify(user);
    }

    @DeleteMapping(value = "/api/user")
    public int deleteById(@Param("id") long id) {
        return userService.deleteById(id);
    }

    @PostMapping(value = "/api/user/login")
    public User login(@RequestBody User user) {
        return userService.login(user);
    }
}