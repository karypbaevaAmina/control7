package com.example.control7.dto;

import com.example.control7.entity.Restaurant;
import com.example.control7.utils.GenerateData;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantDto {
    public static RestaurantDto from(Restaurant restaurant) {
        return builder()
                .id(restaurant.getId())
                .placeName(restaurant.getPlaceName())
                .description(restaurant.getDescription())
                .dishNames(restaurant.getDishNames())
                .build();

    }
    private Long id;
    private String placeName;
    private String description;
    private List<GenerateData.DishName> dishNames;
}
