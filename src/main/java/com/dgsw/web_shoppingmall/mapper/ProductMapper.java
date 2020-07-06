package com.dgsw.web_shoppingmall.mapper;

import java.util.List;

import com.dgsw.web_shoppingmall.domain.Product;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductMapper {
    long add(Product product);
    int modify(Product product);
    int deleteById(@Param("id") long id);
    Product findById(@Param("id") long id);
    List<Product> findByMenuId(@Param("menuId") long id);
    List<Product> findBySubMenuId(@Param("submenuId")long submenuId);
    List<Product> findAll();
}