package com.example.control7.entity;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Dishes {

    private Long id;
    private String dishName;
    private String dishType;
    private int price;

}
