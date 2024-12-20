package com.nan.javaonlinetradingsystem.mapper;

import com.nan.javaonlinetradingsystem.domain.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface ProductMapper {
    /**
     * 插入新产品
     * @param product 产品对象
     * @return 受影响的行数
     */
    int insertProduct(Product product);

    /**
     * 查询所有产品
     * @return 产品列表
     */
    List<Product> selectAllProducts();

    /**
     * 根据产品ID查询产品
     * @param id 产品ID
     * @return 产品对象
     */
    Product selectProductById(@Param("id") Integer id);

    /**
     * 更新产品信息
     * @param product 产品对象
     * @return 受影响的行数
     */
    int updateProduct(Product product);

    /**
     * 根据产品ID删除产品
     * @param id 产品ID
     * @return 受影响的行数
     */
    int deleteProductById(@Param("id") Integer id);

    /**
     * 根据类别ID查询产品
     * @param categoryId 类别ID
     * @return 产品列表
     */
    List<Product> selectProductsByCategoryId(@Param("categoryId") Integer categoryId);
}