package com.dgsw.web_shoppingmall.service;

import java.util.List;

import com.dgsw.web_shoppingmall.domain.User;
import com.dgsw.web_shoppingmall.mapper.UserMapper;
import com.dgsw.web_shoppingmall.service.interfaces.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User findById(long id) {
        return userMapper.findById(id);
    }

    @Override
    public User findByAccount(String account) {
        return userMapper.findByAccount(account);
    }

    @Override
    public int deleteById(long id) {
        return userMapper.deleteById(id);
    }

    @Override
    public long add(User user) {
        return userMapper.add(user);
    }

    @Override
    public int modify(User user) {
        return userMapper.modify(user);
    }

    @Override
    public User login(User user) {
        return userMapper.login(user);
    }
}