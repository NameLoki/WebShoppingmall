package com.dgsw.web_shoppingmall.service.interfaces;

import java.util.List;

import com.dgsw.web_shoppingmall.domain.SubMenu;

public interface SubMenuService {
    List<SubMenu> findByMenuId(long menuId);
    SubMenu findById(long id);
}