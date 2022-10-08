package com.example.control7.service;

import com.example.control7.dao.OrderDao;
import com.example.control7.dao.RestaurantDao;
import com.example.control7.dto.ClientDto;
import com.example.control7.dto.RestaurantDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestaurantService {


    private final RestaurantDao restaurantDao;
    private  final OrderDao orderDao;

    public RestaurantService(RestaurantDao restaurantDao, OrderDao orderDao) {
        this.restaurantDao = restaurantDao;
        this.orderDao = orderDao;
    }

    public List<RestaurantDto> findRestaurant() {
        var rList = restaurantDao.findAll();
        return rList.stream().map(RestaurantDto::from).collect(Collectors.toList());
    }

    public List<ClientDto> findOrders(Long id) {
        return orderDao.findOrders(id);


    }

    public Long create(Long id, int dish) {
        return orderDao.saveOrder(id,dish);
    }









}
