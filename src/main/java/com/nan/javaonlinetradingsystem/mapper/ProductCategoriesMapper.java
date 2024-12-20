package com.nan.javaonlinetradingsystem.mapper;

import com.nan.javaonlinetradingsystem.domain.ProductCategories;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface ProductCategoriesMapper {
    int insertProductCategory(ProductCategories productCategory);  // 插入新类别

    List<ProductCategories> selectAllProductCategories();  // 获取所有类别

    ProductCategories selectProductCategoryById(@Param("id") Integer id);  // 根据ID获取类别

    int updateProductCategory(ProductCategories productCategory);  // 更新类别信息

    int deleteProductCategoryById(@Param("id") Integer id);  // 根据ID删除类别

    // 如果需要根据父类别ID查询子类别，可以添加以下方法
    List<ProductCategories> selectProductCategoriesByParentId(@Param("parentId") Integer parentId);
}