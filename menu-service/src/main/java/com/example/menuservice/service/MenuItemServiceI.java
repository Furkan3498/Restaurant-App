package com.example.menuservice.service;

import com.example.menuservice.requestDto.CrateaMenuItemRequest;

import java.util.List;

public interface MenuItemServiceI {
    void createMenuItem(CrateaMenuItemRequest request);

    List<MenuItemResponse> getAllMenuItemsByRestaurantId(Long restaurantId);

    MenuItemResponse getMenuItemById(Long id);

    void deleteMenuItem(Long id);
}
