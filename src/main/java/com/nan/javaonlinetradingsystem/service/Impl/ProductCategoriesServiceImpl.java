package com.nan.javaonlinetradingsystem.service.Impl;

import com.nan.javaonlinetradingsystem.domain.ProductCategories;
import com.nan.javaonlinetradingsystem.mapper.ProductCategoriesMapper;
import com.nan.javaonlinetradingsystem.service.ProductCategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoriesServiceImpl implements ProductCategoriesService {
    @Autowired
    private ProductCategoriesMapper productCategoriesMapper;

    @Override
    public int addProductCategory(ProductCategories productCategory) {
        return productCategoriesMapper.insertProductCategory(productCategory);  // 调用Mapper中的方法来插入新类别
    }

    @Override
    public List<ProductCategories> selectAllProductCategories() {
        return productCategoriesMapper.selectAllProductCategories();  // 假设Mapper中有selectAllProductCategories方法
    }

    @Override
    public ProductCategories selectProductCategoryById(Integer id) {
        return productCategoriesMapper.selectProductCategoryById(id);  // 假设Mapper中有selectProductCategoryById方法
    }

    @Override
    public int editProductCategory(ProductCategories productCategory) {
        return productCategoriesMapper.updateProductCategory(productCategory);  // 调用Mapper中的方法来更新类别信息
    }

    @Override
    public int deleteProductCategoryById(Integer id) {
        return productCategoriesMapper.deleteProductCategoryById(id);  // 调用Mapper中的方法来删除类别
    }

    @Override
    public List<ProductCategories> selectProductCategoriesByParentId(Integer parentId) {
        return productCategoriesMapper.selectProductCategoriesByParentId(parentId);  // 假设Mapper中有selectProductCategoriesByParentId方法
    }
}