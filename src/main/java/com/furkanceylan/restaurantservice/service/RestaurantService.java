package com.furkanceylan.restaurantservice.service;


import com.furkanceylan.restaurantservice.Exceptions.NotFoundException;
import com.furkanceylan.restaurantservice.entity.RestaurantEntity;
import com.furkanceylan.restaurantservice.mapper.RestaurantMapper;
import com.furkanceylan.restaurantservice.repository.RestaurantRepository;
import com.furkanceylan.restaurantservice.requestDto.CreateRestaurantRequest;
import com.furkanceylan.restaurantservice.responseDto.RestaurantResponse;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service

public class RestaurantService {
    private final RestaurantRepository restaurantRepository;

    private static final Logger log = LoggerFactory.getLogger(RestaurantService.class);

    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public void createdRestaurant(CreateRestaurantRequest  createRestaurantRequest){
        log.info("ActionLog.createdRestaurant.start - request :{}", createRestaurantRequest);
        RestaurantEntity entity = RestaurantMapper.toEntity(createRestaurantRequest);
        restaurantRepository.save(entity);
        log.info("ActionLog.createdRestaurant.end - request :{}", entity.getId());


       // return null;
    }

    public Page<RestaurantResponse> getAllRestaurant(Pageable pageable){
        log.info("ActionLog.getAllRestaurant.start ");
        Page<RestaurantEntity> restaurantEntities = restaurantRepository.findAll(pageable);
        log.info("ActionLog.getAllRestaurant.ended - totalrestaurant :{}",restaurantEntities.getTotalElements());
        return restaurantEntities.map(RestaurantMapper::toResponse);
    }

    public RestaurantResponse getRestaurantById(String id){
        log.info("ActionLog.getRestaurantById.start - id :{}", id);
        RestaurantEntity restaurantEntity = restaurantRepository.findById(UUID.fromString(id)).orElseThrow(
                () ->
                {       log.error("ActionLog.getRestaurantById.error - id :{}", id);
                      return   new NotFoundException("Restaurant not found with id : " + id);
                });
        log.error("ActionLog.getRestaurantById.end - id :{}", restaurantEntity);


        return RestaurantMapper.toResponse(restaurantEntity);

    }

    public void deleteRestaurant(String id){
    log.info("ActionLog.deleteRestaurant.start - id :{}", id);
    RestaurantEntity entity = restaurantRepository.findById(UUID.fromString(id)).orElseThrow(()
    -> {
        log.info("ActionLog.deleteRestaurant.error - id :{}", id);
        return  new NotFoundException("Restaurant not found with id : " + id);

    });
        restaurantRepository.delete(entity);
        log.info("ActionLog.deleteRestaurant.end - id :{}", id);

    }
}
