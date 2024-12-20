package com.nan.javaonlinetradingsystem.service.Impl;

import com.nan.javaonlinetradingsystem.domain.Orders;
import com.nan.javaonlinetradingsystem.mapper.OrdersMapper;
import com.nan.javaonlinetradingsystem.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public int addOrder(Orders orders) {
        return ordersMapper.insertOrder(orders);  // 调用Mapper中的方法来插入新订单
    }

    @Override
    public List<Orders> selectAllOrders() {
        return ordersMapper.selectAllOrders();  // 假设Mapper中有selectAllOrders方法
    }

    @Override
    public Orders selectOrderById(Integer id) {
        return ordersMapper.selectOrderById(id);  // 假设Mapper中有selectOrderById方法
    }

    @Override
    public int editOrder(Orders orders) {
        return ordersMapper.updateOrder(orders);  // 调用Mapper中的方法来更新订单信息
    }

    @Override
    public int deleteOrderById(Integer id) {
        return ordersMapper.deleteOrderById(id);  // 调用Mapper中的方法来删除订单
    }

    @Override
    public List<Orders> selectOrdersByUserId(Integer userId) {
        return ordersMapper.selectOrdersByUserId(userId);  // 假设Mapper中有selectOrdersByUserId方法
    }

    @Override
    public List<Orders> selectOrdersByStatus(String status) {
        return ordersMapper.selectOrdersByStatus(status);  // 假设Mapper中有selectOrdersByStatus方法
    }
}