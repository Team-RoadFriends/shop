package com.RoadShop.shopping.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    private Integer product_id;
    private Integer categoryId;
    private String productName;
    private Double price;
    private Integer stockQuantity;
    private String description;
    private String createAt;

}
