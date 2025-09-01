package com.example.menuservice.repository;

import com.example.menuservice.entity.MenuEntity;
import org.springframework.data.repository.CrudRepository;

public interface MenuItemRepository extends CrudRepository<MenuEntity,Long> {
}
