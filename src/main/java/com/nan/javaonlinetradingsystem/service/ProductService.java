package com.nan.javaonlinetradingsystem.service;

import com.nan.javaonlinetradingsystem.domain.Product;
import java.util.List;

public interface ProductService {
    /**
     * 新增产品
     * @param product 产品对象
     * @return 受影响的行数
     */
    int addProduct(Product product);

    /**
     * 获取所有产品列表
     * @return 产品列表
     */
    List<Product> selectAllProducts();

    /**
     * 根据产品ID获取产品信息
     * @param id 产品ID
     * @return 产品对象
     */
    Product selectProductById(Integer id);

    /**
     * 更新产品信息
     * @param product 产品对象
     * @return 受影响的行数
     */
    int editProduct(Product product);

    /**
     * 根据产品ID删除产品
     * @param id 产品ID
     * @return 受影响的行数
     */
    int deleteProductById(Integer id);

    /**
     * 根据类别ID查询产品
     * @param categoryId 类别ID
     * @return 产品列表
     */
    List<Product> selectProductsByCategoryId(Integer categoryId);
}