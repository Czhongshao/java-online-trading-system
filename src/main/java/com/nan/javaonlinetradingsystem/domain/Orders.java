package com.nan.javaonlinetradingsystem.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Orders {
    private int orderID; // 订单ID
    private int userID; // 用户ID
    private Date orderDate; // 订单日期
    private BigDecimal totalAmount; // 总金额
    private String orderStatus; // 订单状态

    // 无参构造函数
    public Orders() {
    }

    // 全参构造函数
    public Orders(int orderID, int userID, Date orderDate, BigDecimal totalAmount, String orderStatus) {
        this.orderID = orderID;
        this.userID = userID;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.orderStatus = orderStatus;
    }

    // Getter和Setter方法
    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    // toString方法，用于打印对象信息
    @Override
    public String toString() {
        return "Orders{" +
                "orderID=" + orderID +
                ", userID=" + userID +
                ", orderDate=" + orderDate +
                ", totalAmount=" + totalAmount +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }
}