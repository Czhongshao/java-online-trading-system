package com.nan.javaonlinetradingsystem.domain;

import java.math.BigDecimal;

public class Product {
    private int productID; // 产品ID
    private String productName; // 产品名称
    private String productDescription; // 产品描述
    private BigDecimal price; // 价格
    private int stockQuantity; // 库存数量
    private int categoryID; // 类别ID

    // 无参构造函数
    public Product() {
    }

    // 全参构造函数
    public Product(int productID, String productName, String productDescription, BigDecimal price, int stockQuantity, int categoryID) {
        this.productID = productID;
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.categoryID = categoryID;
    }

    // Getter和Setter方法
    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    // toString方法，用于打印对象信息
    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                ", categoryID=" + categoryID +
                '}';
    }
}