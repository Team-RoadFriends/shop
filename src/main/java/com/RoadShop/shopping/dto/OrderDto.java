package com.RoadShop.shopping.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDto {
    private Integer order_id; //주문번호
    private Integer user_id; //유저번호
    private String order_status; //주문상황
    private int total_amount; //총 금액
    private String shipping_address; //배달주소
    private String created_at; //주문시각
}
