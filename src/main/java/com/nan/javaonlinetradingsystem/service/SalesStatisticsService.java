package com.nan.javaonlinetradingsystem.service;

import com.nan.javaonlinetradingsystem.domain.SalesStatistics;

import java.sql.Date;
import java.util.List;

public interface SalesStatisticsService {
    int addSalesStatistics(SalesStatistics salesStatistics);

    List<SalesStatistics> selectAllSalesStatistics();

    SalesStatistics selectSalesStatisticsById(Integer id);

    int editSalesStatistics(SalesStatistics salesStatistics);

    int deleteSalesStatisticsById(Integer id);

    List<SalesStatistics> selectSalesStatisticsByDate(Date date);

    List<SalesStatistics> selectSalesStatisticsByCategoryId(Integer categoryId);

    List<SalesStatistics> selectSalesStatisticsByMerchantId(Integer merchantId);
}