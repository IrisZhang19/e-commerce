package com.ecommerce.springboot_ecom.service;

import com.ecommerce.springboot_ecom.dao.ProductDAO;
import com.ecommerce.springboot_ecom.dao.ProductDAOImpl;
import com.ecommerce.springboot_ecom.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class ProductServiceImpl implements  ProductService {

    private ProductDAO productDAO;

    @Autowired
    public ProductServiceImpl(ProductDAO productDAO){
        this.productDAO = productDAO;
    }

    @Override
    public List<Product> findAll() {
        return productDAO.findAll();
    }

    @Override
    public Product findById(int id) {
        return productDAO.findById(id);
    }

    @Transactional
    @Override
    public Product save(Product product) {
        return productDAO.save(product);
    }

    @Transactional
    @Override
    public void deleteById(int id) {
        productDAO.deleteById(id);
    }
}
