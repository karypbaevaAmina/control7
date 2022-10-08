package com.example.control7.service;

import com.example.control7.dao.DishesDao;
import com.example.control7.dto.DishesDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishesService {

    private final DishesDao dishesDao;


    public DishesService(DishesDao dishesDao) {
        this.dishesDao = dishesDao;
    }

    public List<DishesDto> findDishesById(Long id) {
        return dishesDao.findDishesByID(id);
    }



}
