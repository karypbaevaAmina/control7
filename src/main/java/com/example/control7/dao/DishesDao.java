package com.example.control7.dao;

import com.example.control7.dto.DishesDto;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DishesDao {
    private final JdbcTemplate jdbcTemplate;
    private final PasswordEncoder encoder = new BCryptPasswordEncoder();

    public List<DishesDto> findDishesByID(Long id){
        String sql = "select * \n" +
                "from dishes \n" +
                "where restaurant = ?;";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(DishesDto.class), id);
    }
}
