package com.furkanceylan.restaurantservice.service;


import com.furkanceylan.restaurantservice.Exceptions.NotFoundException;
import com.furkanceylan.restaurantservice.entity.RestaurantEntity;
import com.furkanceylan.restaurantservice.mapper.RestaurantMapper;
import com.furkanceylan.restaurantservice.repository.RestaurantRepository;
import com.furkanceylan.restaurantservice.requestDto.CreateRestaurantRequest;
import com.furkanceylan.restaurantservice.responseDto.RestaurantResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j

public class RestaurantService {
    private final RestaurantRepository restaurantRepository;


    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public void createdRestaurant(CreateRestaurantRequest  createRestaurantRequest){
        log.info("ActionLog.createdRestaurant.start - request :{}", createRestaurantRequest);
        RestaurantEntity entity = RestaurantMapper.toEntity(createRestaurantRequest);
        restaurantRepository.save(entity);
        log.info("ActionLog.createdRestaurant.end - request :{}", entity.getId());


    }

    public RestaurantResponse getRestaurantById(String id){
        log.info("ActionLog.getRestaurantById.start - id :{}", id);
        RestaurantEntity restaurantEntity = restaurantRepository.findById(UUID.fromString(id)).orElseThrow(
                () ->
                {       log.error("ActionLog.getRestaurantById.error - id :{}", id);
                      return   new NotFoundException("Restaurant not found with id : " + id);
                });
        log.error("ActionLog.getRestaurantById.end - id :{}", restaurantEntity);


    }
}
