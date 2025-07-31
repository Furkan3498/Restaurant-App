package com.furkanceylan.restaurantservice.mapper;


import com.furkanceylan.restaurantservice.entity.RestaurantEntity;
import com.furkanceylan.restaurantservice.requestDto.CreateRestaurantRequest;
import com.furkanceylan.restaurantservice.responseDto.RestaurantResponse;
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

    public static RestaurantResponse toResponse(RestaurantEntity restaurantEntity){
        RestaurantResponse restaurantResponse = new RestaurantResponse();
        restaurantResponse.setName(restaurantEntity.getName());
        restaurantResponse.setId(restaurantEntity.getId());
        restaurantResponse.setAddress(restaurantEntity.getAddress());
        restaurantResponse.setCity(restaurantEntity.getCity());
       restaurantResponse.setCategoryType(restaurantEntity.getCategory());
       restaurantResponse.setOpen(restaurantEntity.getOpen());
       return  restaurantResponse;
    }
}
