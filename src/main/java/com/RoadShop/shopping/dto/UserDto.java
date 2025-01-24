package com.RoadShop.shopping.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
  private int id;
  private String email;
  private String password;
  private String name;
  private String phone;
  private String created_at;
}
