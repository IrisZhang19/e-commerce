package com.ecommerce.springboot_ecom.service;

import com.ecommerce.springboot_ecom.entities.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();

    Category save(Category category);

    Category findById(int id);

    void deleteById(int id);
}
