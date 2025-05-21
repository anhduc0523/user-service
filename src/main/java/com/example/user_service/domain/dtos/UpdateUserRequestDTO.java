package com.example.user_service.domain.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateUserRequestDTO {
    @NotNull
    String name;

    @NotNull
    String keycloakId;

    @NotNull
    String email;
    String phone;
    String address;
    Integer age;
    Integer gender;
    String avatar;
}
