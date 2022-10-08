package com.example.control7.dto;

import ch.qos.logback.core.net.server.Client;
import com.example.control7.entity.Dishes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

    private Long id;
    private Client client;
    private Dishes dish;
    private LocalDateTime dateTime;

}
