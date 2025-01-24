package com.RoadShop.shopping.controller;

import com.RoadShop.shopping.dto.UserDto;
import com.RoadShop.shopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserService userService;

  //회원가입 페이지
  @GetMapping("/insertMember")
  public String insertMember(){
    return "user/insertMember";
  }

  //회원가입
  @PostMapping("/singUp")
  @ResponseBody
  public void singUp(@RequestBody UserDto userDto){
    System.out.println(userDto);
    userService.signUp(userDto);
  }

  //로그인 페이지
  @GetMapping
  public String login(){
    return "user/login";
  }

  @PostMapping("/login")
  @ResponseBody
  public String logIn(@RequestParam("email") String email, Model model){

    return "redirect:/user";
  }
}
