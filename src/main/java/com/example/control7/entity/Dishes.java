package com.example.control7.entity;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Dishes {

    private int id;
    private String dishName;
    private String dishType;
    private int price;

    private Restaurant restaurant;

}
