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


    public String create(Client client) {
        String sql = "insert into client (id, name, email, password, enabled) " +
                "values (?,?,?,?, true);";
        jdbcTemplate.update(sql,client.getId(), client.getName(), client.getEmail(), client.getPassword());
        createAuthority(client.getName());
        return "Регистрация прошла успешно!";
    }

    private void createAuthority(String name) {
        var userID =  getIdByClientName(name);
        String query = "INSERT INTO authority(client, authority)" +
                "VALUES(?, 'ROLE_USER')";
        jdbcTemplate.update(query, userID);
    }

    public Long getIdByClientName(String name) {
        String query = "SELECT id FROM client WHERE name = ?";
        return jdbcTemplate.queryForObject(query, Long.class, name);
    }








}
