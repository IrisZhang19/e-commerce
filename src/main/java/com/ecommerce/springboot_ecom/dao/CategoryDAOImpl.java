package com.ecommerce.springboot_ecom.dao;

import com.ecommerce.springboot_ecom.entities.Category;
import com.ecommerce.springboot_ecom.entities.Product;
import com.ecommerce.springboot_ecom.service.CategoryService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public class CategoryDAOImpl implements CategoryDAO {

    private EntityManager entityManager;

    @Autowired
    public CategoryDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public List<Category> findAll() {
        TypedQuery<Category> query = entityManager.createQuery("FROM Category", Category.class);

        List<Category> categories = query.getResultList();
        return categories;
    }

    @Override
    public Category save(Category category) {
       Category category1 = entityManager.merge(category);
       return  category1;
    }

    @Override
    public Category findById(int id) {
        return entityManager.find(Category.class, id);
    }

    @Override
    public void deleteById(int id) {
        Category category = entityManager.find(Category.class, id);
        entityManager.remove(category);
    }


}
