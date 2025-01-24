package com.RoadShop.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartItemsController {

    @GetMapping("/show-cart")
    public String showCart(){
        return "/cart-items/show-cart-items";
    }
}
