package com.RoadShop.shopping.mapper;

import com.RoadShop.shopping.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

  void signUp(UserDto userDto);
}
