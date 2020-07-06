package com.dgsw.web_shoppingmall.service.interfaces;

import java.util.List;

import com.dgsw.web_shoppingmall.domain.Menu;

public interface MenuService {
    List<Menu> findAll();
    Menu findById(long id);
}