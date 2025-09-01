package com.example.menuservice.repository;

import com.example.menuservice.entity.MenuEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MenuItemRepository extends CrudRepository<MenuEntity,Long> {
    List<MenuEntity> findByRestaurantId(Long restaurantId);
}
