package com.example.control7.service;

import com.example.control7.dao.RestaurantDao;
import com.example.control7.dto.RestaurantDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestaurantService {


    private final RestaurantDao restaurantDao;

    public RestaurantService(RestaurantDao restaurantDao) {
        this.restaurantDao = restaurantDao;
    }

    public List<RestaurantDto> findMovies() {
        var movieList = restaurantDao.findAll();
        return movieList.stream().map(RestaurantDto::from).collect(Collectors.toList());
    }


}
