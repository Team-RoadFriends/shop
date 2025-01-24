package com.RoadShop.shopping.mapper;

import com.RoadShop.shopping.dto.CartItemsDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CartItemsMapper {

    List<CartItemsDto> getCartItemList();

    CartItemsDto getCartItemById(int id);

    void removeCartItem(int id);
}
