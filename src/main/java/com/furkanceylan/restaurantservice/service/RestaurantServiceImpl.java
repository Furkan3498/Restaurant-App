package com.furkanceylan.restaurantservice.service;

import com.furkanceylan.restaurantservice.entity.RestaurantEntity;
import com.furkanceylan.restaurantservice.requestDto.CreateRestaurantRequest;

public interface RestaurantServiceImpl {

    void createdRestaurant(CreateRestaurantRequest request);


    RestaurantEntity  getRestaurantById(String id);
    RestaurantEntity  updateRestaurant(String id,CreateRestaurantRequest request);

    void deletedRestaurant(String id);
}
