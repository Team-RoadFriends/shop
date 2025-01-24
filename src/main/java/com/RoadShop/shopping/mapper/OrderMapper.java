package com.RoadShop.shopping.mapper;

import com.RoadShop.shopping.dto.OrderDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {

    void insertOrder(OrderDto orderDto);
    List<OrderDto> getOrders();
}
