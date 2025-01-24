package com.RoadShop.shopping.controller;

import com.RoadShop.shopping.dto.OrderDto;
import com.RoadShop.shopping.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    //추가(보류)
//    @PostMapping
//    public ResponseEntity<?> createOrder(@RequestBody OrderDto orderDto, BindingResult bindingResult){
//        //System.out.println(orderDto.getOrder());
//        orderService.createOrder(orderDto);
//        return ResponseEntity.ok().build();
//    }

   //리스트 출력
   @GetMapping("/list")
   public String getOrders(Model model){
       List<OrderDto> orders = orderService.getOrders();
       model.addAttribute("orders", orders);
       System.out.println(orders);
       return "shop/order";
   }


//    @GetMapping("/list")
//    public String order(){
//        return "shop/order";
//    }

}
