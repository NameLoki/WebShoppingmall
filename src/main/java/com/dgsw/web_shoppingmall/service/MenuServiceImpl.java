package com.dgsw.web_shoppingmall.service;

import java.util.List;

import com.dgsw.web_shoppingmall.domain.Menu;
import com.dgsw.web_shoppingmall.mapper.MenuMapper;
import com.dgsw.web_shoppingmall.service.interfaces.MenuService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> findAll() {
        return menuMapper.findAll();
    }

    @Override
    public Menu findById(long id) {
        return menuMapper.findById(id);
    }
    
}