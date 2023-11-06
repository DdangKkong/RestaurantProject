package zerobase.restaurant.controller;

import lombok.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import zerobase.restaurant.service.RestaurantService;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping
    public ResponseEntity<?> searchRestaurant() {
        return null;
    }

    @PostMapping
    public ResponseEntity<?> addRestaurant() {
        return null;
    }

    @DeleteMapping
    public ResponseEntity<?> deleteRestaurant() {
        return null;
    }

}
