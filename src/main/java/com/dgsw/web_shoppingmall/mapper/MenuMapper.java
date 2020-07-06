package com.dgsw.web_shoppingmall.mapper;

import java.util.List;

import com.dgsw.web_shoppingmall.domain.Menu;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MenuMapper {
    List<Menu> findAll();
    Menu findById(long id);
}