package com.example.control7.dao;

import com.example.control7.dto.RestaurantDto;
import com.example.control7.entity.Restaurant;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class RestaurantDao {

    private final JdbcTemplate jdbcTemplate;
    private final PasswordEncoder encoder = new BCryptPasswordEncoder();

    public List<Restaurant> findAll() {
        String sql = "select * from restaurant";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Restaurant.class));
    }



}
