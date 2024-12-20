package com.nan.javaonlinetradingsystem.controller;

import com.nan.javaonlinetradingsystem.domain.OrdersDetails;
import com.nan.javaonlinetradingsystem.service.OrderDetailsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderDetails") // 订单详情管理接口的基础路径
@Api(description = "订单详情管理接口", tags = {"订单详情管理"}) // 用于Swagger文档的描述
public class OrderDetailsController {

    @Autowired
    private OrderDetailsService orderDetailsService; // 注入订单详情服务

    @ApiOperation(value = "添加新订单详情", notes = "通过提供订单详情信息来添加新订单详情", response = String.class, httpMethod = "POST")
    @PostMapping("/add") // 添加新订单详情的接口
    public ResponseEntity<?> addOrderDetail(@RequestBody OrdersDetails orderDetail) { // 接收订单详情对象
        int affectedRows = orderDetailsService.addOrderDetail(orderDetail); // 调用服务层添加订单详情
        if (affectedRows > 0) {
            return ResponseEntity.ok("订单详情添加成功"); // 添加成功返回成功消息
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("订单详情添加失败"); // 添加失败返回失败消息
        }
    }

    @ApiOperation(value = "获取所有订单详情列表", notes = "返回系统中所有订单详情的列表", response = List.class, responseContainer = "List", httpMethod = "GET")
    @GetMapping("/list") // 获取所有订单详情列表的接口
    public List<OrdersDetails> getAllOrderDetails() { // 返回所有订单详情列表
        return orderDetailsService.selectAllOrderDetails(); // 调用服务层获取所有订单详情
    }

    @ApiOperation(value = "根据订单详情ID获取订单详情信息", notes = "通过订单详情ID获取特定订单详情的详细信息", response = OrdersDetails.class, httpMethod = "GET")
    @GetMapping("/{id}") // 根据订单详情ID获取订单详情信息的接口
    public OrdersDetails getOrderDetailById(@PathVariable Integer id) { // 接收订单详情ID
        return orderDetailsService.selectOrderDetailById(id); // 调用服务层根据ID获取订单详情
    }

    @ApiOperation(value = "更新订单详情信息", notes = "通过提供订单详情信息来更新现有订单详情", response = String.class, httpMethod = "PUT")
    @PutMapping("/edit") // 更新订单详情信息的接口
    public ResponseEntity<?> editOrderDetail(@RequestBody OrdersDetails orderDetail) { // 接收订单详情对象
        int affectedRows = orderDetailsService.editOrderDetail(orderDetail); // 调用服务层更新订单详情
        if (affectedRows > 0) {
            return ResponseEntity.ok("订单详情更新成功"); // 更新成功返回成功消息
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("订单详情更新失败"); // 更新失败返回失败消息
        }
    }

    @ApiOperation(value = "删除订单详情", notes = "根据订单详情ID删除特定订单详情", response = String.class, httpMethod = "DELETE")
    @DeleteMapping("/{id}") // 删除订单详情的接口
    public ResponseEntity<?> deleteOrderDetail(@PathVariable Integer id) { // 接收订单详情ID
        int affectedRows = orderDetailsService.deleteOrderDetailById(id); // 调用服务层删除订单详情
        if (affectedRows > 0) {
            return ResponseEntity.ok("订单详情删除成功"); // 删除成功返回成功消息
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("订单详情未找到"); // 删除失败返回失败消息
        }
    }

    @ApiOperation(value = "根据订单ID查询订单详情", notes = "通过订单ID获取所有相关订单详情的列表", response = List.class, responseContainer = "List", httpMethod = "GET")
    @GetMapping("/order/{orderId}") // 根据订单ID查询订单详情的接口
    public List<OrdersDetails> getOrderDetailsByOrderId(@PathVariable Integer orderId) { // 接收订单ID
        return orderDetailsService.selectOrderDetailsByOrderId(orderId); // 调用服务层根据订单ID获取订单详情
    }
}