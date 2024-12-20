package com.nan.javaonlinetradingsystem.service.Impl;

import com.nan.javaonlinetradingsystem.domain.OrdersDetails;
import com.nan.javaonlinetradingsystem.mapper.OrderDetailsMapper;
import com.nan.javaonlinetradingsystem.service.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {
    @Autowired
    private OrderDetailsMapper orderDetailsMapper;

    @Override
    public int addOrderDetail(OrdersDetails orderDetail) {
        return orderDetailsMapper.insertOrderDetail(orderDetail);
    }

    @Override
    public List<OrdersDetails> selectAllOrderDetails() {
        return orderDetailsMapper.selectAllOrderDetails();
    }

    @Override
    public OrdersDetails selectOrderDetailById(Integer id) {
        return orderDetailsMapper.selectOrderDetailById(id);
    }

    @Override
    public int editOrderDetail(OrdersDetails orderDetail) {
        return orderDetailsMapper.updateOrderDetail(orderDetail);
    }

    @Override
    public int deleteOrderDetailById(Integer id) {
        return orderDetailsMapper.deleteOrderDetailById(id);
    }

    @Override
    public List<OrdersDetails> selectOrderDetailsByOrderId(Integer orderId) {
        return orderDetailsMapper.selectOrderDetailsByOrderId(orderId);
    }
}