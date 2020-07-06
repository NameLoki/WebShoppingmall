package com.dgsw.web_shoppingmall.service.interfaces;

import java.util.List;

import com.dgsw.web_shoppingmall.domain.User;

public interface UserService {
    List<User> findAll();
    User findById(long id);
    User findByAccount(String account);
    int deleteById(long id);
    long add(User user);
    int modify(User user);
    User login(User user);
}
