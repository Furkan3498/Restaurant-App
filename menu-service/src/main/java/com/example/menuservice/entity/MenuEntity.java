package com.example.menuservice.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "menu_items")
@Entity

public class MenuEntity {
    @Id
    private Long id;
}
