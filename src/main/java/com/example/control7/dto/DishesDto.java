package com.example.control7.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DishesDto {

    private int id;
    private String dishName;
    private String dishType;
    private int price;


}
