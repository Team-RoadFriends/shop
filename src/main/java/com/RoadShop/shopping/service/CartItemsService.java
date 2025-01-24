package com.RoadShop.shopping.service;

import com.RoadShop.shopping.dto.CartItemsDto;
import com.RoadShop.shopping.mapper.CartItemsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartItemsService {

    @Autowired
    CartItemsMapper cartItemsMapper;

    public List<CartItemsDto> getCartItemList(){
        return cartItemsMapper.getCartItemList();
    }

    public CartItemsDto getCartItem(int id) {

        return cartItemsMapper.getCartItemById(id);
    }

    public void removeCartItem(int id) {
        cartItemsMapper.removeCartItem(id);
    }
}
