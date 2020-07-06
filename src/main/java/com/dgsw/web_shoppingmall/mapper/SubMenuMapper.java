package com.dgsw.web_shoppingmall.mapper;

import java.util.List;

import com.dgsw.web_shoppingmall.domain.SubMenu;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SubMenuMapper {
    List<SubMenu> findByMenuId(long menuId);
    SubMenu findById(long id);
    
}