package com.RoadShop.shopping.controller;

import com.RoadShop.shopping.dto.CartItemsDto;
import com.RoadShop.shopping.service.CartItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class CartItemsController {

    @Autowired
    CartItemsService cartItemsService;

    @GetMapping("/show-cart")
    public String getCartItemList(Model model){
        List<CartItemsDto> cartItemList = cartItemsService.getCartItemList();
        model.addAttribute("cart_items", cartItemList);
        return "/cart-items/show-cart-items";
    }

    @GetMapping("/show-cart/{id}")
    public String getCartItem(@PathVariable("id") int id, Model model){
        try{
            CartItemsDto cartItemsDto = cartItemsService.getCartItem(id);
            model.addAttribute("cart_items", cartItemsDto);
        } catch (IllegalStateException e) {
            model.addAttribute("error", e.getMessage());
            return "/common/hello";
        }
        return "/cart-items/detail-cart-item";
    }

    @GetMapping("/show-cart/{id}/remove")
    public String removeCartItem(@PathVariable("id") int id){
        cartItemsService.removeCartItem(id);
        return "redirect:/show-cart";
    }
}
