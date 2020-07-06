package com.dgsw.web_shoppingmall.controller;

import java.util.List;

import com.dgsw.web_shoppingmall.domain.Menu;
import com.dgsw.web_shoppingmall.service.interfaces.MenuService;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MenuController {
    @Autowired
    private MenuService menuService;

    @GetMapping(value = "/api/menu")
    public List<Menu> findAll() {
        return menuService.findAll();
    }

    @GetMapping(value = "/api/menu/id")
    public Menu findById(@Param("id") long id) {
        return menuService.findById(id);
    }
}