package com.RoadShop.shopping.service;

import com.RoadShop.shopping.dto.OrderDto;
import com.RoadShop.shopping.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderMapper orderMapper;

    public void createOrder(OrderDto orderDto){
        orderMapper.insertOrder(orderDto);
    }
    public List<OrderDto> getOrders(){
        return orderMapper.getOrders();
    }

}
