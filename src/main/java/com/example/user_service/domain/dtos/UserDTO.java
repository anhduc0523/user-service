package com.example.user_service.domain.dtos;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    Long id;
    String name;
    String email;
    String phone;
    String address;
    Integer age;
    String avatar;
}
