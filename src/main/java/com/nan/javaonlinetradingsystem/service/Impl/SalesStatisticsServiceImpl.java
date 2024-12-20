package com.nan.javaonlinetradingsystem.service.Impl;

import com.nan.javaonlinetradingsystem.domain.SalesStatistics;
import com.nan.javaonlinetradingsystem.mapper.SalesStatisticsMapper;
import com.nan.javaonlinetradingsystem.service.SalesStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class SalesStatisticsServiceImpl implements SalesStatisticsService {
    @Autowired
    private SalesStatisticsMapper salesStatisticsMapper;

    @Override
    public int addSalesStatistics(SalesStatistics salesStatistics) {
        return salesStatisticsMapper.insertSalesStatistics(salesStatistics);
    }

    @Override
    public List<SalesStatistics> selectAllSalesStatistics() {
        return salesStatisticsMapper.selectAllSalesStatistics();
    }

    @Override
    public SalesStatistics selectSalesStatisticsById(Integer id) {
        return salesStatisticsMapper.selectSalesStatisticsById(id);
    }

    @Override
    public int editSalesStatistics(SalesStatistics salesStatistics) {
        return salesStatisticsMapper.updateSalesStatistics(salesStatistics);
    }

    @Override
    public int deleteSalesStatisticsById(Integer id) {
        return salesStatisticsMapper.deleteSalesStatisticsById(id);
    }

    @Override
    public List<SalesStatistics> selectSalesStatisticsByDate(Date date) {
        return salesStatisticsMapper.selectSalesStatisticsByDate(date);
    }

    @Override
    public List<SalesStatistics> selectSalesStatisticsByCategoryId(Integer categoryId) {
        return salesStatisticsMapper.selectSalesStatisticsByCategoryId(categoryId);
    }

    @Override
    public List<SalesStatistics> selectSalesStatisticsByMerchantId(Integer merchantId) {
        return salesStatisticsMapper.selectSalesStatisticsByMerchantId(merchantId);
    }
}