package com.ecommerce.springboot_ecom.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "product")
@Data
public class Product{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Long price;

    @Column(name = "image_url")
    private String image_url;

    @Column(name = "is_active")
    private Boolean is_active;

    @Column(name = "category_id")
    private Integer category_id;

}