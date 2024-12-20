package com.nan.javaonlinetradingsystem.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;

@ApiModel(description = "销售统计数据模型")
public class SalesStatistics {

    @ApiModelProperty(value = "统计ID", example = "1", required = true)
    private int statisticID;

    @ApiModelProperty(value = "日期", example = "2024-12-20", required = true)
    private Date date;

    @ApiModelProperty(value = "类别ID", example = "101", required = true)
    private int categoryID;

    @ApiModelProperty(value = "商家ID", example = "202", required = true)
    private int merchantID;

    @ApiModelProperty(value = "销售金额", example = "1234.56", required = true)
    private BigDecimal salesAmount;

    // 无参构造函数
    public SalesStatistics() {
    }

    // 全参构造函数
    public SalesStatistics(int statisticID, Date date, int categoryID, int merchantID, BigDecimal salesAmount) {
        this.statisticID = statisticID;
        this.date = date;
        this.categoryID = categoryID;
        this.merchantID = merchantID;
        this.salesAmount = salesAmount;
    }

    // Getter和Setter方法
    public int getStatisticID() {
        return statisticID;
    }

    public void setStatisticID(int statisticID) {
        this.statisticID = statisticID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public int getMerchantID() {
        return merchantID;
    }

    public void setMerchantID(int merchantID) {
        this.merchantID = merchantID;
    }

    public BigDecimal getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(BigDecimal salesAmount) {
        this.salesAmount = salesAmount;
    }

    // toString方法，用于打印对象信息
    @Override
    public String toString() {
        return "{"
                + "\"statisticID\":" + statisticID
                + ",\"date\":\"" + date + "\""
                + ",\"categoryID\":" + categoryID
                + ",\"merchantID\":" + merchantID
                + ",\"salesAmount\":" + salesAmount
                + "}";
    }
}
