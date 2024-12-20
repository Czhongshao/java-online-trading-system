package com.nan.javaonlinetradingsystem.mapper;

import com.nan.javaonlinetradingsystem.domain.OrdersDetails;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface OrderDetailsMapper {
    int insertOrderDetail(OrdersDetails orderDetail);

    List<OrdersDetails> selectAllOrderDetails();

    OrdersDetails selectOrderDetailById(@Param("id") Integer id);

    int updateOrderDetail(OrdersDetails orderDetail);

    int deleteOrderDetailById(@Param("id") Integer id);

    List<OrdersDetails> selectOrderDetailsByOrderId(@Param("orderId") Integer orderId);
}