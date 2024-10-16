package com.ecommerce.springboot_ecom.dao;

import com.ecommerce.springboot_ecom.entities.Category;
import com.ecommerce.springboot_ecom.service.CategoryService;

import java.util.List;

public interface CategoryDAO {
    List<Category> findAll();

    Category save(Category category);

    Category findById(int id);

    void deleteById(int id);
}
