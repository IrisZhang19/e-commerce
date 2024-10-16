package com.ecommerce.springboot_ecom.service;

import com.ecommerce.springboot_ecom.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();


    Product findById(int id);

    Product save(Product product);

    void deleteById(int id);
}
