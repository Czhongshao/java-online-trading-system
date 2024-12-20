package com.nan.javaonlinetradingsystem.service;

import com.nan.javaonlinetradingsystem.domain.Orders;
import java.util.List;

public interface OrdersService {
    /**
     * 新增订单
     * @param orders 订单对象
     * @return 受影响的行数
     */
    int addOrder(Orders orders);

    /**
     * 获取所有订单列表
     * @return 订单列表
     */
    List<Orders> selectAllOrders();

    /**
     * 根据订单ID获取订单信息
     * @param id 订单ID
     * @return 订单对象
     */
    Orders selectOrderById(Integer id);

    /**
     * 更新订单信息
     * @param orders 订单对象
     * @return 受影响的行数
     */
    int editOrder(Orders orders);

    /**
     * 根据订单ID删除订单
     * @param id 订单ID
     * @return 受影响的行数
     */
    int deleteOrderById(Integer id);

    /**
     * 根据用户ID查询订单
     * @param userId 用户ID
     * @return 订单列表
     */
    List<Orders> selectOrdersByUserId(Integer userId);

    /**
     * 根据订单状态查询订单
     * @param status 订单状态
     * @return 订单列表
     */
    List<Orders> selectOrdersByStatus(String status);
}