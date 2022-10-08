package com.example.control7.controller;

import com.example.control7.dto.RestaurantDto;
import com.example.control7.service.RestaurantService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/rest")
public class RestaurantController {

    private  final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping
    public List <RestaurantDto> findMovies() {
        return restaurantService.findMovies();
    }
}
