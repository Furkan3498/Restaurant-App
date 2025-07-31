package com.furkanceylan.restaurantservice.service;

import com.furkanceylan.restaurantservice.entity.RestaurantEntity;
import com.furkanceylan.restaurantservice.requestDto.CreateRestaurantRequest;
import com.furkanceylan.restaurantservice.responseDto.RestaurantResponse;

public interface RestaurantServiceImpl {

    void createdRestaurant(CreateRestaurantRequest request);


    RestaurantResponse getRestaurantById(String id);
    RestaurantEntity  updateRestaurant(String id,CreateRestaurantRequest request);

    void deletedRestaurant(String id);
}
