package com.example.control7.dto;

import ch.qos.logback.core.net.server.Client;
import com.example.control7.entity.Order;
import com.example.control7.entity.Restaurant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientDto{

    private Long id;
    private String name;
    private String email;
    private String password;
    private boolean enabled;



}
