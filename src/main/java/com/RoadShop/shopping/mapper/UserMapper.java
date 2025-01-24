package com.RoadShop.shopping.mapper;

import com.RoadShop.shopping.dto.UserDto;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserMapper {

  void signUp(UserDto userDto);

}
