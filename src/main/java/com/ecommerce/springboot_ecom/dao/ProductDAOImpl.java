package com.ecommerce.springboot_ecom.dao;

import com.ecommerce.springboot_ecom.entities.Product;
import com.ecommerce.springboot_ecom.service.ProductService;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ProductDAOImpl implements ProductDAO {

    private EntityManager entityManager;

    @Autowired
    public ProductDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;

    }
    @Override
    public List<Product> findAll() {
        // create a query
        TypedQuery<Product> theQuery = entityManager.createQuery("FROM Product", Product.class);

        // execute query and get result list
        List<Product> products = theQuery.getResultList();

        // return the results
        return products;
    }

    @Override
    public Product findById(int id) {
        Product product = entityManager.find(Product.class, id);
        return product;
    }

    @Override
    public Product save(Product product) {
        Product dbProduct = entityManager.merge(product);
        return dbProduct;
    }

    @Override
    public void deleteById(int id) {
        Product product = entityManager.find(Product.class, id);
        entityManager.remove(product);
    }
}
