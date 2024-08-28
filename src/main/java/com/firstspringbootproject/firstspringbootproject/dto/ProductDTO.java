package com.firstspringbootproject.firstspringbootproject.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class ProductDTO {

    // Getters and setters
    private Long id;
    private String name;
    private BigDecimal price;
    private CategoryDTO category;

}
