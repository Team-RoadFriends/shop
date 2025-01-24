package com.RoadShop.shopping.service;

import com.RoadShop.shopping.dto.UserDto;
import com.RoadShop.shopping.mapper.UserMapper;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

  @Autowired
  private UserMapper userMapper;

  public void signUp(UserDto userDto) {
    userMapper.signUp(userDto);
  }

}
