package com.nan.javaonlinetradingsystem.controller;

import com.nan.javaonlinetradingsystem.domain.Product;
import com.nan.javaonlinetradingsystem.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@Api(description = "产品管理接口", tags = {"产品管理"})
public class ProductController {

    @Autowired
    private ProductService productService;

    @ApiOperation(value = "添加新产品", notes = "通过提供产品信息来添加新产品", response = String.class, httpMethod = "POST")
    @PostMapping("/add")
    public ResponseEntity<?> addProduct(@RequestBody Product product) {
        int affectedRows = productService.addProduct(product);
        if (affectedRows > 0) {
            return ResponseEntity.ok("Product added successfully");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Product addition failed");
        }
    }

    @ApiOperation(value = "获取所有产品列表", notes = "返回系统中所有产品的列表", response = List.class, responseContainer = "List", httpMethod = "GET")
    @GetMapping("/list")
    public List<Product> getAllProducts() {
        return productService.selectAllProducts();
    }

    @ApiOperation(value = "根据产品ID获取产品信息", notes = "通过产品ID获取特定产品的详细信息", response = Product.class, httpMethod = "GET")
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Integer id) {
        return productService.selectProductById(id);
    }

    @ApiOperation(value = "更新产品信息", notes = "通过提供产品信息来更新现有产品", response = String.class, httpMethod = "PUT")
    @PutMapping("/edit")
    public ResponseEntity<?> editProduct(@RequestBody Product product) {
        int affectedRows = productService.editProduct(product);
        if (affectedRows > 0) {
            return ResponseEntity.ok("Product updated successfully");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Product update failed");
        }
    }

    @ApiOperation(value = "删除产品", notes = "根据产品ID删除特定产品", response = String.class, httpMethod = "DELETE")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Integer id) {
        int affectedRows = productService.deleteProductById(id);
        if (affectedRows > 0) {
            return ResponseEntity.ok("Product deleted successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found");
        }
    }

    @ApiOperation(value = "根据类别ID获取产品列表", notes = "通过类别ID获取所有产品的列表", response = List.class, responseContainer = "List", httpMethod = "GET")
    @GetMapping("/category/{categoryId}")
    public List<Product> getProductsByCategoryId(@PathVariable Integer categoryId) {
        return productService.selectProductsByCategoryId(categoryId);
    }
}