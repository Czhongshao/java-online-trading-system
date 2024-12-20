package com.nan.javaonlinetradingsystem.domain;

import java.math.BigDecimal;

public class OrdersDetails {
    private int orderDetailsID; // 订单详情ID
    private int orderID; // 订单ID
    private int productID; // 产品ID
    private int quantity; // 数量
    private BigDecimal unitPrice; // 单价

    // 无参构造函数
    public OrdersDetails() {
    }

    // 全参构造函数
    public OrdersDetails(int orderDetailsID, int orderID, int productID, int quantity, BigDecimal unitPrice) {
        this.orderDetailsID = orderDetailsID;
        this.orderID = orderID;
        this.productID = productID;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    // Getter和Setter方法
    public int getOrderDetailsID() {
        return orderDetailsID;
    }

    public void setOrderDetailsID(int orderDetailsID) {
        this.orderDetailsID = orderDetailsID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "OrdersDetails{" +
                "orderDetailsID=" + orderDetailsID +
                ", orderID=" + orderID +
                ", productID=" + productID +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                '}';
    }
}