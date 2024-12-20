package com.nan.javaonlinetradingsystem.mapper;

import com.nan.javaonlinetradingsystem.domain.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface OrdersMapper {
    /**
     * 插入新订单
     * @param orders 订单对象
     * @return 受影响的行数
     */
    int insertOrder(Orders orders);

    /**
     * 查询所有订单
     * @return 订单列表
     */
    List<Orders> selectAllOrders();

    /**
     * 根据订单ID查询订单
     * @param id 订单ID
     * @return 订单对象
     */
    Orders selectOrderById(@Param("id") Integer id);

    /**
     * 更新订单信息
     * @param orders 订单对象
     * @return 受影响的行数
     */
    int updateOrder(Orders orders);

    /**
     * 根据订单ID删除订单
     * @param id 订单ID
     * @return 受影响的行数
     */
    int deleteOrderById(@Param("id") Integer id);

    /**
     * 根据用户ID查询订单
     * @param userId 用户ID
     * @return 订单列表
     */
    List<Orders> selectOrdersByUserId(@Param("userId") Integer userId);

    /**
     * 根据订单状态查询订单
     * @param status 订单状态
     * @return 订单列表
     */
    List<Orders> selectOrdersByStatus(@Param("status") String status);
}