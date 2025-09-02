package com.example.menuservice.service;

import java.util.List;

public interface MenuItemServiceI {
    void createMenuItem(CrateaMenuItemRequest request);

    List<MenuItemResponse> getAllMenuItemsByRestaurantId(Long restaurantId);
}
