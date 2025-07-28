package com.furkanceylan.restaurantservice.mapper;


import com.furkanceylan.restaurantservice.entity.RestaurantEntity;
import com.furkanceylan.restaurantservice.requestDto.CreateRestaurantRequest;
import lombok.experimental.UtilityClass;

@UtilityClass
public class RestaurantMapper {

    public static RestaurantEntity toEntity(CreateRestaurantRequest request){
        RestaurantEntity restaurantEntity = new RestaurantEntity();
        restaurantEntity.setAddress(request.getAddress());
        restaurantEntity.setCity(request.getCity());
        restaurantEntity.setCategory(request.getCategory());
        restaurantEntity.setName(request.getName());
        restaurantEntity.setisOpen(Boolean.TRUE);

        return restaurantEntity;
    }
}
