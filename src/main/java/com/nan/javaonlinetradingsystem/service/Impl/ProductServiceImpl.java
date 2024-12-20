package com.nan.javaonlinetradingsystem.service.Impl;

import com.nan.javaonlinetradingsystem.domain.Product;
import com.nan.javaonlinetradingsystem.mapper.ProductMapper;
import com.nan.javaonlinetradingsystem.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public int addProduct(Product product) {
        return productMapper.insertProduct(product);  // 调用Mapper中的方法来插入新产品
    }

    @Override
    public List<Product> selectAllProducts() {
        return productMapper.selectAllProducts();  // 假设Mapper中有selectAllProducts方法
    }

    @Override
    public Product selectProductById(Integer id) {
        return productMapper.selectProductById(id);  // 假设Mapper中有selectProductById方法
    }

    @Override
    public int editProduct(Product product) {
        return productMapper.updateProduct(product);  // 调用Mapper中的方法来更新产品信息
    }

    @Override
    public int deleteProductById(Integer id) {
        return productMapper.deleteProductById(id);  // 调用Mapper中的方法来删除产品
    }

    @Override
    public List<Product> selectProductsByCategoryId(Integer categoryId) {
        return productMapper.selectProductsByCategoryId(categoryId);  // 假设Mapper中有selectProductsByCategoryId方法
    }
}