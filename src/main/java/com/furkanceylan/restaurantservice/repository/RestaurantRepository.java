package com.furkanceylan.restaurantservice.repository;

import com.furkanceylan.restaurantservice.entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Long> {
}
