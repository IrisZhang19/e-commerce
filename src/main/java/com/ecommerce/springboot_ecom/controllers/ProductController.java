package com.ecommerce.springboot_ecom.controllers;


import com.ecommerce.springboot_ecom.entities.Product;
import com.ecommerce.springboot_ecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> findAll(){
        return productService.findAll();
    }

    @GetMapping("/products/{id}")
    public Product findById(@PathVariable int id){
        return productService.findById(id);
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product){
        Product dbProduct = productService.save(product);
        return dbProduct;
    }

    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product product){
        Product dbProduct = productService.save(product);
        return dbProduct;
    }

    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable int id){
        Product product = productService.findById(id);
        if(product == null){
            throw new RuntimeException("product not found by id : " + id);
        }
        productService.deleteById(id);
        return "product deleted by id - " + id;
    }
}
