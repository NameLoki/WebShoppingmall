package com.dgsw.web_shoppingmall.service.interfaces;

import java.util.List;

import com.dgsw.web_shoppingmall.domain.Product;

public interface ProductService {
    List<Product> findAll();
    int deleteById(long id);
    long add(Product product);
    int modify(Product product);
    Product findById(long id);
    List<Product> findByMenuId(long menuId);
    List<Product> findBySubMenuId(long subMenuId);
}