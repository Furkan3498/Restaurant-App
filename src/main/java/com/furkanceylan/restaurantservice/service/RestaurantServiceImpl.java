package com.furkanceylan.restaurantservice.service;

import com.furkanceylan.restaurantservice.entity.RestaurantEntity;
import com.furkanceylan.restaurantservice.requestDto.CreateRestaurantRequest;
import com.furkanceylan.restaurantservice.responseDto.RestaurantResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface RestaurantServiceImpl {

    void createdRestaurant(CreateRestaurantRequest request);

    Page<RestaurantResponse> getAllRestaurants(Pageable pageable);

    RestaurantResponse getRestaurantById(Long id);
    RestaurantEntity  updateRestaurant(String id,CreateRestaurantRequest request);

    void deletedRestaurant(Long id);
}
