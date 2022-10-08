package com.example.control7.controller;

import com.example.control7.dto.ClientDto;
import com.example.control7.dto.DishesDto;
import com.example.control7.dto.RestaurantDto;
import com.example.control7.service.DishesService;
import com.example.control7.service.RestaurantService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/database")
public class RestaurantController {

    private  final RestaurantService restaurantService;
    private  final DishesService dishesService;

    public RestaurantController(RestaurantService restaurantService, DishesService dishesService) {
        this.restaurantService = restaurantService;
        this.dishesService = dishesService;
    }

    @GetMapping("/rest")  //поиск списка заведений
    public List <RestaurantDto> findRestaurant() {
        return restaurantService.findRestaurant();
    }

    @GetMapping("/rest/{id}") // поиск блюд по заведению;
    public ResponseEntity<List<DishesDto>> findPostByUserId(@PathVariable Long id) {
        return new ResponseEntity<>(dishesService.findDishesById(id), HttpStatus.OK);
    }

    @GetMapping("/order/{id}") // список заказов;
    public ResponseEntity<List<ClientDto>> findOrders(@PathVariable Long id) {
        return new ResponseEntity<>(restaurantService.findOrders(id), HttpStatus.OK);
    }

    @PostMapping("/create")
    public Long createOrder (@RequestParam Long id, @RequestParam int dish){
        return restaurantService.create(id, dish);
    }






}
