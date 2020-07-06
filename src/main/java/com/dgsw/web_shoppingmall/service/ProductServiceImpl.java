package com.dgsw.web_shoppingmall.service;

import java.util.List;

import com.dgsw.web_shoppingmall.domain.Product;
import com.dgsw.web_shoppingmall.mapper.ProductMapper;
import com.dgsw.web_shoppingmall.service.interfaces.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> findAll() {
        return productMapper.findAll();
    }

    @Override
    public int deleteById(long id) {
        return productMapper.deleteById(id);
    }

    @Override
    public long add(Product product) {
        return productMapper.add(product);
    }

    @Override
    public int modify(Product product) {
        return productMapper.modify(product);
    }

    @Override
    public Product findById(long id) {
        return productMapper.findById(id);
    }

    @Override
    public List<Product> findByMenuId(long menuId) {
        return productMapper.findByMenuId(menuId);
    }

    @Override
    public List<Product> findBySubMenuId(long subMenuId) {
        return productMapper.findBySubMenuId(subMenuId);
    }
}