package com.example.control7.dao;

import com.example.control7.dto.ClientDto;
import com.example.control7.dto.DishesDto;
import com.example.control7.dto.OrderDto;
import com.example.control7.entity.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Component
@RequiredArgsConstructor
public class OrderDao {
    private final JdbcTemplate jdbcTemplate;

    public List<ClientDto> findOrders(Long id){
        String sql = "select c.order  \n" +
                "from client c \n" +
                "where id = 1;";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(ClientDto.class), id);
    }

    public Long saveOrder(Long id, int dish) {
        String sql = "INSERT INTO orders(id, dish, order_date_time )\n" +
                "VALUES(?,?,?,?)";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(con -> {
            PreparedStatement ps = con.prepareStatement(sql, new String[]{"id"});
            ps.setLong(1, id);
//            ps.setString(2, email);
            ps.setInt(2, dish);
            ps.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            return ps;
        }, keyHolder);
        return Objects.requireNonNull(keyHolder.getKey()).longValue();
    }


}
