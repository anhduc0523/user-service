package com.example.user_service.domain.dtos;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    Integer id;
    String name;
    String email;
    String phone;
    String address;
    Integer age;
    String avatar;
}
