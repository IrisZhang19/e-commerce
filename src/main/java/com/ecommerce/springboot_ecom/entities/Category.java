package com.ecommerce.springboot_ecom.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "category")
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Integer id;

    @Column(name="name")
    private  String  name;

    @Column(name = "description")
    private  String description;
}
