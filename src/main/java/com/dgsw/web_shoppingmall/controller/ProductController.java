package com.dgsw.web_shoppingmall.controller;

import java.util.List;

import com.dgsw.web_shoppingmall.domain.Product;
import com.dgsw.web_shoppingmall.service.interfaces.ProductService;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping(value = "/api/product")
    public List<Product> findAll() {
        return productService.findAll();
    }

    @DeleteMapping(value = "/api/product/id")
    public int deleteById(@Param("id") long id) {
        return productService.deleteById(id);
    }

    @PostMapping(value = "/api/product")
    public long add(@RequestBody Product product) {
        return productService.add(product);
    }

    @PutMapping(value = "/api/product")
    public int modify(@RequestBody Product product) {
        return productService.modify(product);
    }

    @GetMapping(value = "/api/product/id")
    public Product findById(@Param("id") long id) {
        return productService.findById(id);
    }

    @GetMapping(value = "/api/product/menuId")
    public List<Product> findByMenuId(@Param("menuId") long menuId) {
        return productService.findByMenuId(menuId);
    }

    @GetMapping(value = "/api/product/subMenuId")
    public List<Product> findBySubMenuId(@Param("subMenuId") long subMenuId) {
        return productService.findBySubMenuId(subMenuId);
    }
}