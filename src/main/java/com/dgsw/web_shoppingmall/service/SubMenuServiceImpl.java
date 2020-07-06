package com.dgsw.web_shoppingmall.service;

import java.util.List;

import com.dgsw.web_shoppingmall.domain.SubMenu;
import com.dgsw.web_shoppingmall.mapper.SubMenuMapper;
import com.dgsw.web_shoppingmall.service.interfaces.SubMenuService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubMenuServiceImpl implements SubMenuService {

    @Autowired
    private SubMenuMapper subMenuMapper;

    @Override
    public List<SubMenu> findByMenuId(long menuId) {
        return subMenuMapper.findByMenuId(menuId);
    }

    @Override
    public SubMenu findById(long id) {
        return subMenuMapper.findById(id);
    }
}