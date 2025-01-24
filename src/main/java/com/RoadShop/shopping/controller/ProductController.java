package com.RoadShop.shopping.controller;

import com.RoadShop.shopping.dto.ProductDto;
import com.RoadShop.shopping.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductMapper productMapper;

    @GetMapping("/create")
    public String create(){
        return "shop/create-product";
    }

    @PostMapping
    @ResponseBody
    public void createProduct(@RequestBody ProductDto productDto){
        System.out.println(productDto.getProductName());
        productMapper.insertProduct(productDto);
    }
}
