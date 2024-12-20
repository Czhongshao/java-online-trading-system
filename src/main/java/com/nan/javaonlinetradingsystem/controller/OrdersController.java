package com.nan.javaonlinetradingsystem.controller;

import com.nan.javaonlinetradingsystem.domain.Orders;
import com.nan.javaonlinetradingsystem.service.OrdersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@Api(description = "订单管理接口", tags = {"订单管理"})
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @ApiOperation(value = "添加新订单", notes = "通过提供订单信息来添加新订单", response = String.class, httpMethod = "POST")
    @PostMapping("/add")
    public ResponseEntity<?> addOrder(@RequestBody Orders orders) {
        int affectedRows = ordersService.addOrder(orders);
        if (affectedRows > 0) {
            return ResponseEntity.ok("Order added successfully");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Order addition failed");
        }
    }

    @ApiOperation(value = "获取所有订单列表", notes = "返回系统中所有订单的列表", response = List.class, responseContainer = "List", httpMethod = "GET")
    @GetMapping("/list")
    public List<Orders> getAllOrders() {
        return ordersService.selectAllOrders();
    }

    @ApiOperation(value = "根据订单ID获取订单信息", notes = "通过订单ID获取特定订单的详细信息", response = Orders.class, httpMethod = "GET")
    @GetMapping("/{id}")
    public Orders getOrderById(@PathVariable Integer id) {
        return ordersService.selectOrderById(id);
    }

    @ApiOperation(value = "更新订单信息", notes = "通过提供订单信息来更新现有订单", response = String.class, httpMethod = "PUT")
    @PutMapping("/edit")
    public ResponseEntity<?> editOrder(@RequestBody Orders orders) {
        int affectedRows = ordersService.editOrder(orders);
        if (affectedRows > 0) {
            return ResponseEntity.ok("Order updated successfully");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Order update failed");
        }
    }

    @ApiOperation(value = "删除订单", notes = "根据订单ID删除特定订单", response = String.class, httpMethod = "DELETE")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteOrder(@PathVariable Integer id) {
        int affectedRows = ordersService.deleteOrderById(id);
        if (affectedRows > 0) {
            return ResponseEntity.ok("Order deleted successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Order not found");
        }
    }

    @ApiOperation(value = "根据用户ID查询订单", notes = "通过用户ID获取所有相关订单的列表", response = List.class, responseContainer = "List", httpMethod = "GET")
    @GetMapping("/user/{userId}")
    public List<Orders> getOrdersByUserId(@PathVariable Integer userId) {
        return ordersService.selectOrdersByUserId(userId);
    }

    @ApiOperation(value = "根据订单状态查询订单", notes = "通过订单状态获取所有相关订单的列表", response = List.class, responseContainer = "List", httpMethod = "GET")
    @GetMapping("/status/{status}")
    public List<Orders> getOrdersByStatus(@PathVariable String status) {
        return ordersService.selectOrdersByStatus(status);
    }
}