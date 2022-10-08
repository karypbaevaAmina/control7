package com.example.control7.entity;

import ch.qos.logback.core.net.server.Client;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private Long id;
    private Client client;
    private Dishes dish;
    private LocalDateTime dateTime;


}
