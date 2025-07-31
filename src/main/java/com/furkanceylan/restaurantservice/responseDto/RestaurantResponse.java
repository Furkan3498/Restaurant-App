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

    public RestaurantResponse() {
    }

    public RestaurantResponse(UUID id, String name, String address, City city, CategoryType categoryType, Boolean isOpen) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.city = city;
        this.categoryType = categoryType;
        this.isOpen = isOpen;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public CategoryType getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(CategoryType categoryType) {
        this.categoryType = categoryType;
    }

    public Boolean getOpen() {
        return isOpen;
    }

    public void setOpen(Boolean open) {
        isOpen = open;
    }
}
