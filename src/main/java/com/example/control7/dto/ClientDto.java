package com.example.control7.dto;

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
