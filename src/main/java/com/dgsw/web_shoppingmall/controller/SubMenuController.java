package com.dgsw.web_shoppingmall.controller;

import java.util.List;

import com.dgsw.web_shoppingmall.domain.SubMenu;
import com.dgsw.web_shoppingmall.service.interfaces.SubMenuService;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubMenuController {
    
    @Autowired
    private SubMenuService subMenuService;

    @GetMapping(value = "/api/subMenu/menuId")
    public List<SubMenu> findByMenuId(@Param("menuId") long menuId) {
        return subMenuService.findByMenuId(menuId);
    }

    @GetMapping(value = "/api/subMenu/id")
    public SubMenu findById(@Param("id") long id) {
        return subMenuService.findById(id);
    }
    
}