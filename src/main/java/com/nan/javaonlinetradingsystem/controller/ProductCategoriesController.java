package com.nan.javaonlinetradingsystem.controller;

import com.nan.javaonlinetradingsystem.domain.ProductCategories;
import com.nan.javaonlinetradingsystem.service.ProductCategoriesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productCategories")
@Api(description = "产品类别管理接口", tags = {"产品类别管理"})
public class ProductCategoriesController {

    @Autowired
    private ProductCategoriesService productCategoriesService;

    @ApiOperation(value = "添加新产品类别", notes = "通过提供产品类别信息来添加新产品类别", response = String.class, httpMethod = "POST")
    @PostMapping("/add")
    public ResponseEntity<?> addProductCategory(@RequestBody ProductCategories productCategory) {
        int affectedRows = productCategoriesService.addProductCategory(productCategory);
        if (affectedRows > 0) {
            return ResponseEntity.ok("Product category added successfully");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Product category addition failed");
        }
    }

    @ApiOperation(value = "获取所有产品类别列表", notes = "返回系统中所有产品类别的列表", response = List.class, responseContainer = "List", httpMethod = "GET")
    @GetMapping("/list")
    public List<ProductCategories> getAllProductCategories() {
        return productCategoriesService.selectAllProductCategories();
    }

    @ApiOperation(value = "根据产品类别ID获取产品类别信息", notes = "通过产品类别ID获取特定产品类别的详细信息", response = ProductCategories.class, httpMethod = "GET")
    @GetMapping("/{id}")
    public ProductCategories getProductCategoryById(@PathVariable Integer id) {
        return productCategoriesService.selectProductCategoryById(id);
    }

    @ApiOperation(value = "更新产品类别信息", notes = "通过提供产品类别信息来更新现有产品类别", response = String.class, httpMethod = "PUT")
    @PutMapping("/edit")
    public ResponseEntity<?> editProductCategory(@RequestBody ProductCategories productCategory) {
        int affectedRows = productCategoriesService.editProductCategory(productCategory);
        if (affectedRows > 0) {
            return ResponseEntity.ok("Product category updated successfully");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Product category update failed");
        }
    }

    @ApiOperation(value = "删除产品类别", notes = "根据产品类别ID删除特定产品类别", response = String.class, httpMethod = "DELETE")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProductCategory(@PathVariable Integer id) {
        int affectedRows = productCategoriesService.deleteProductCategoryById(id);
        if (affectedRows > 0) {
            return ResponseEntity.ok("Product category deleted successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product category not found");
        }
    }

    @ApiOperation(value = "根据父类别ID获取子类别列表", notes = "通过父类别ID获取所有子类别的列表", response = List.class, responseContainer = "List", httpMethod = "GET")
    @GetMapping("/children/{parentId}")
    public List<ProductCategories> getProductCategoriesByParentId(@PathVariable Integer parentId) {
        return productCategoriesService.selectProductCategoriesByParentId(parentId);
    }
}