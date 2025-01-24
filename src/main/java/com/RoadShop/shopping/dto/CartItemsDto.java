package com.RoadShop.shopping.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class CartItemsDto {
    private int cartItemId;
    private int userId;
    private int prdId;
    private int quantity;
    private String createdAt;
}
