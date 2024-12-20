package com.nan.javaonlinetradingsystem.domain;

import java.util.Objects;

public class ProductCategories {
    private int CategoryID; // 主键，对应数据库中的CategoryID
    private String CategoryName; // 类别名称，对应数据库中的CategoryName
    private int ParentCategoryID; // 父类别ID，对应数据库中的ParentCategoryID

    public ProductCategories() {
    }

    // 构造函数，用于创建一个新的ProductCategories对象
    public ProductCategories(int categoryID, String categoryName, int parentCategoryID) {
        this.CategoryID = categoryID;
        this.CategoryName = categoryName;
        this.ParentCategoryID = parentCategoryID;
    }

    // Getter和Setter方法
    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int categoryID) {
        this.CategoryID = categoryID;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        this.CategoryName = categoryName;
    }

    public int getParentCategoryID() {
        return ParentCategoryID;
    }

    public void setParentCategoryID(int parentCategoryID) {
        this.ParentCategoryID = parentCategoryID;
    }

    // toString方法，用于打印对象信息
    @Override
    public String toString() {
        return "ProductCategories{" +
                "CategoryID=" + CategoryID +
                ", CategoryName='" + CategoryName + '\'' +
                ", ParentCategoryID=" + ParentCategoryID +
                '}';
    }

    // equals方法，用于比较两个ProductCategories对象是否相等
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductCategories that = (ProductCategories) o;
        return CategoryID == that.CategoryID &&
                Objects.equals(CategoryName, that.CategoryName) &&
                ParentCategoryID == that.ParentCategoryID;
    }

    // hashCode方法，用于生成对象的哈希码
    @Override
    public int hashCode() {
        return Objects.hash(CategoryID, CategoryName, ParentCategoryID);
    }
}