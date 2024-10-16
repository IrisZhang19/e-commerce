package com.ecommerce.springboot_ecom.dao;

import com.ecommerce.springboot_ecom.entities.Product;

import java.util.List;

public interface ProductDAO {
    List<Product> findAll();

    Product findById(int id);

    Product save(Product product);

    void deleteById(int id);
}
