package com.example.control7.dao;



import com.example.control7.dto.OrderDto;
import com.example.control7.entity.Client;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class ClientDao {

    private final JdbcTemplate jdbcTemplate;


    public void create(Client client) {
        String sql = "insert into client (id, name, email, password, enabled) " +
                "values (?,?,?,?, true);";
        jdbcTemplate.update(sql,client.getId(), client.getName(), client.getEmail(), client.getPassword());
    }

    public String makeOrder (OrderDto orderDto) {
        String query = "INSERT INTO orders(id, dish, order_date_time )\n" +
                "VALUES(?,?,?,?)";
        jdbcTemplate.update(query, orderDto.getId(), orderDto.getClient(), orderDto.getDish(), LocalDateTime.now());
        return "Заказ сделан!";
    }




}
