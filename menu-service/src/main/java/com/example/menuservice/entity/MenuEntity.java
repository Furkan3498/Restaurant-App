package com.example.menuservice.entity;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Table(name = "menu_items")
@Entity

public class MenuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long restauranId;
    private String name;
    private String description;
    private BigDecimal price;
    private Boolean isAvailable;
    @Enumerated(EnumType.STRING)
    private MenuCategory menuCategory;

}
