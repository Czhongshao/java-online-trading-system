package com.nan.javaonlinetradingsystem.service;

import com.nan.javaonlinetradingsystem.domain.ProductCategories;
import java.util.List;

public interface ProductCategoriesService {
    /**
     * 新增产品类别
     * @param productCategory 产品类别对象
     * @return 受影响的行数
     */
    int addProductCategory(ProductCategories productCategory);

    /**
     * 获取所有产品类别列表
     * @return 产品类别列表
     */
    List<ProductCategories> selectAllProductCategories();

    /**
     * 根据产品类别ID获取产品类别信息
     * @param id 产品类别ID
     * @return 产品类别对象
     */
    ProductCategories selectProductCategoryById(Integer id);

    /**
     * 更新产品类别信息
     * @param productCategory 产品类别对象
     * @return 受影响的行数
     */
    int editProductCategory(ProductCategories productCategory);

    /**
     * 根据产品类别ID删除产品类别
     * @param id 产品类别ID
     * @return 受影响的行数
     */
    int deleteProductCategoryById(Integer id);

    /**
     * 根据父类别ID查询子类别
     * @param parentId 父类别ID
     * @return 子类别列表
     */
    List<ProductCategories> selectProductCategoriesByParentId(Integer parentId);
}