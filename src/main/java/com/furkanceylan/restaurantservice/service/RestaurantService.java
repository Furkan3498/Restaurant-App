package com.furkanceylan.restaurantservice.service;


import com.furkanceylan.restaurantservice.repository.RestaurantRepository;
import com.furkanceylan.restaurantservice.requestDto.CreateRestaurantRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j

public class RestaurantService {
    private final RestaurantRepository restaurantRepository;


    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public void createdRestaurant(CreateRestaurantRequest  createRestaurantRequest){

    }
}
