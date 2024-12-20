package com.nan.javaonlinetradingsystem.mapper;

import com.nan.javaonlinetradingsystem.domain.SalesStatistics;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.Date;
import java.util.List;

@Mapper
public interface SalesStatisticsMapper {
    int insertSalesStatistics(SalesStatistics salesStatistics);

    List<SalesStatistics> selectAllSalesStatistics();

    SalesStatistics selectSalesStatisticsById(@Param("id") Integer id);

    int updateSalesStatistics(SalesStatistics salesStatistics);

    int deleteSalesStatisticsById(@Param("id") Integer id);

    List<SalesStatistics> selectSalesStatisticsByDate(@Param("date") Date date);

    List<SalesStatistics> selectSalesStatisticsByCategoryId(@Param("categoryId") Integer categoryId);

    List<SalesStatistics> selectSalesStatisticsByMerchantId(@Param("merchantId") Integer merchantId);
}