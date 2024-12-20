package com.nan.javaonlinetradingsystem.service;

import com.nan.javaonlinetradingsystem.domain.OrdersDetails;
import java.util.List;

public interface OrderDetailsService {
    int addOrderDetail(OrdersDetails orderDetail);

    List<OrdersDetails> selectAllOrderDetails();

    OrdersDetails selectOrderDetailById(Integer id);

    int editOrderDetail(OrdersDetails orderDetail);

    int deleteOrderDetailById(Integer id);

    List<OrdersDetails> selectOrderDetailsByOrderId(Integer orderId);
}