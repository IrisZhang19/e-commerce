package com.ecommerce.springboot_ecom.service;

import com.ecommerce.springboot_ecom.dao.CategoryDAO;
import com.ecommerce.springboot_ecom.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryDAO categoryDAO;

    @Autowired
    public CategoryServiceImpl(CategoryDAO categoryDAO){
        this.categoryDAO = categoryDAO;
    }

    @Override
    public List<Category> findAll() {
        return categoryDAO.findAll();
    }

    @Override
    public Category findById(int id) {
        return categoryDAO.findById(id);
    }

    @Transactional
    @Override
    public Category save(Category category) {
        return categoryDAO.save(category);
    }

    @Transactional
    @Override
    public void deleteById(int id) {
        categoryDAO.deleteById(id);
    }
}
