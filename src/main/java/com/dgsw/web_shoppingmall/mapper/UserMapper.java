package com.dgsw.web_shoppingmall.mapper;

import java.util.List;

import com.dgsw.web_shoppingmall.domain.User;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    List<User> findAll();
    int deleteById(@Param("id") long id);
    long add(User user);
    int modify(User user);
    User findById(long id);
    User login(User user);
    User findByAccount(String account);
}