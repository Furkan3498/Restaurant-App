package com.furkanceylan.restaurantservice.requestDto;

import com.furkanceylan.restaurantservice.entity.CategoryType;
import com.furkanceylan.restaurantservice.entity.City;
import jakarta.validation.constraints.NotBlank;

import java.util.UUID;

public class CreateRestaurantRequest {



    @NotBlank(message = "Name cannot be blank")
    private String name;
    @NotBlank(message = "Address cannot be blank")
    private String address;

    private City city;


    private CategoryType category;

    public CreateRestaurantRequest() {
    }

    public CreateRestaurantRequest(String name, String address, City city,   CategoryType category) {
        this.name = name;
        this.address = address;
        this.city = city;

        this.category = category;
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



    public CategoryType getCategory() {
        return category;
    }

    public void setCategory(CategoryType category) {
        this.category = category;
    }
}
