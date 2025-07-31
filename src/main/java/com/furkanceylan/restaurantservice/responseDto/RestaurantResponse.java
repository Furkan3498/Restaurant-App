package com.furkanceylan.restaurantservice.responseDto;

import com.furkanceylan.restaurantservice.entity.CategoryType;
import com.furkanceylan.restaurantservice.entity.City;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.util.UUID;

public class RestaurantResponse {
    private UUID id;
    private String name;
    private String address;
    private City city;
    private CategoryType categoryType;
    private Boolean isOpen;

}
