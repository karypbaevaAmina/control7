package com.example.control7.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Сlient {

    private Long id;
    private String name;
    private String email;
    private String password;
    private boolean enabled;



}
