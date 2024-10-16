package com.ecommerce.springboot_ecom.controllers;


import com.ecommerce.springboot_ecom.entities.Category;
import com.ecommerce.springboot_ecom.entities.Product;
import com.ecommerce.springboot_ecom.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {

    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @GetMapping("/categories")
    public List<Category> getCategories(){
        return categoryService.findAll();
    }

    @GetMapping("/categories/{id}")
    public  Category findById(@PathVariable int id){
        return categoryService.findById(id);
    }

    @PostMapping("/categories")
    public Category addCategory(@RequestBody Category category){
        Category category1 = categoryService.save(category);
        return category1;
    }

    @PutMapping("/categories")
    public Category updateCategory(@RequestBody Category category){
        Category category1 = categoryService.save(category);
        return  category1;
    }

    @DeleteMapping("/categories/{id}")
    public String deleteCategory(@PathVariable int id){
        Category category = categoryService.findById(id);

        if(category == null){
            throw new RuntimeException("cannot find category by id: " + id);
        }

        categoryService.deleteById(id);

        return "category deleted by id - " + id;
    }
}
