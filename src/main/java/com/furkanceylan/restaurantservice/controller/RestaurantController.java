package com.furkanceylan.restaurantservice.controller;


import com.furkanceylan.restaurantservice.requestDto.CreateRestaurantRequest;
import com.furkanceylan.restaurantservice.responseDto.RestaurantResponse;
import com.furkanceylan.restaurantservice.service.RestaurantService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/restaurants")
public class RestaurantController {

    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createRestaurant(@RequestBody @Valid CreateRestaurantRequest createRestaurantRequest){
   // public ResponseEntity<Void> createRestaurant(@RequestBody @Valid CreateRestaurantRequest createRestaurantRequest){
        restaurantService.createdRestaurant(createRestaurantRequest);
    // return    ResponseEntity.ok(restaurantService.createdRestaurant(createRestaurantRequest));
    }
    @GetMapping()
    public ResponseEntity<Page<RestaurantResponse>> getAllRestaurants(Pageable pageable){
        return  ResponseEntity.ok(restaurantService.getAllRestaurant(pageable));
    }
    @GetMapping("/{id}")
    public ResponseEntity<RestaurantResponse> getRestaurantById(@PathVariable Long id){
        return  ResponseEntity.ok( restaurantService.getRestaurantById(id));
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteRestaurant(@PathVariable Long id){
        restaurantService.deleteRestaurant(id);
    }
}
