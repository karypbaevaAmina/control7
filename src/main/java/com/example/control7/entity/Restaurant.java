package com.example.control7.entity;

import com.example.control7.utils.GenerateData;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {

    private Long id;
    private String placeName;
    private String description;
    private List<String> dishNames = List.of("pizza", "pasta","eggs","soup");
    //    private List<GenerateData.DishName> dishNames;


}
