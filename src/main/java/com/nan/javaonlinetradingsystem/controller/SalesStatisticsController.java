package com.nan.javaonlinetradingsystem.controller;

import com.nan.javaonlinetradingsystem.domain.SalesStatistics;
import com.nan.javaonlinetradingsystem.service.SalesStatisticsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/salesStatistics") // 销售统计管理接口的基础路径
@Api(description = "销售统计管理接口", tags = {"销售统计管理"}) // 用于Swagger文档的描述
public class SalesStatisticsController {

    @Autowired
    private SalesStatisticsService salesStatisticsService; // 注入销售统计服务

    @ApiOperation(value = "添加新销售统计", notes = "通过提供销售统计信息来添加新销售统计", response = String.class, httpMethod = "POST")
    @PostMapping("/add")
    public ResponseEntity<?> addSalesStatistics(@RequestBody SalesStatistics salesStatistics) {
        int affectedRows = salesStatisticsService.addSalesStatistics(salesStatistics);
        if (affectedRows > 0) {
            return ResponseEntity.ok("销售统计添加成功");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("销售统计添加失败");
        }
    }

    @ApiOperation(
            value = "获取所有销售统计列表",
            notes = "返回系统中所有销售统计的列表",
            response = SalesStatistics.class, // 指定返回的对象类型
            responseContainer = "List"
    )
    @GetMapping("/list")
    public List<SalesStatistics> getAllSalesStatistics() {
        return salesStatisticsService.selectAllSalesStatistics();
    }



    @ApiOperation(value = "根据销售统计ID获取销售统计信息", notes = "通过销售统计ID获取特定销售统计的详细信息", response = SalesStatistics.class, httpMethod = "GET")
    @GetMapping("/{id}")
    public SalesStatistics getSalesStatisticsById(@PathVariable Integer id) {
        return salesStatisticsService.selectSalesStatisticsById(id);
    }

    @ApiOperation(value = "更新销售统计信息", notes = "通过提供销售统计信息来更新现有销售统计", response = String.class, httpMethod = "POST")
    @PostMapping("/edit")
    public ResponseEntity<?> editSalesStatistics(@RequestBody SalesStatistics salesStatistics) {
        int affectedRows = salesStatisticsService.editSalesStatistics(salesStatistics);
        if (affectedRows > 0) {
            return ResponseEntity.ok("销售统计更新成功");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("销售统计更新失败");
        }
    }

    @ApiOperation(value = "删除销售统计", notes = "根据销售统计ID删除特定销售统计", response = String.class, httpMethod = "DELETE")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteSalesStatistics(@PathVariable Integer id) {
        int affectedRows = salesStatisticsService.deleteSalesStatisticsById(id);
        if (affectedRows > 0) {
            return ResponseEntity.ok("销售统计删除成功");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("销售统计未找到");
        }
    }

    @ApiOperation(value = "根据日期查询销售统计", notes = "通过日期获取所有相关销售统计的列表", response = List.class, responseContainer = "List", httpMethod = "GET")
    @GetMapping("/date/{date}")
    public List<SalesStatistics> getSalesStatisticsByDate(@PathVariable Date date) {
        return salesStatisticsService.selectSalesStatisticsByDate(date);
    }

    @ApiOperation(value = "根据类别ID查询销售统计", notes = "通过类别ID获取所有相关销售统计的列表", response = List.class, responseContainer = "List", httpMethod = "GET")
    @GetMapping("/category/{categoryId}")
    public List<SalesStatistics> getSalesStatisticsByCategoryId(@PathVariable Integer categoryId) {
        return salesStatisticsService.selectSalesStatisticsByCategoryId(categoryId);
    }

    @ApiOperation(value = "根据商家ID查询销售统计", notes = "通过商家ID获取所有相关销售统计的列表", response = List.class, responseContainer = "List", httpMethod = "GET")
    @GetMapping("/merchant/{merchantId}")
    public List<SalesStatistics> getSalesStatisticsByMerchantId(@PathVariable Integer merchantId) {
        return salesStatisticsService.selectSalesStatisticsByMerchantId(merchantId);
    }
}