package com.RoadShop.shopping.mapper;

import com.RoadShop.shopping.dto.ProductDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {
    void insertProduct(ProductDto productDto);


}
