package com.example.user_service.domain.services;

import com.example.user_service.domain.dtos.CreateUserRequestDTO;
import com.example.user_service.domain.dtos.UpdateUserRequestDTO;
import com.example.user_service.domain.dtos.UserDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserDTO get(Integer id);
    Object create(CreateUserRequestDTO userDTO);
    Object update(Integer id,UpdateUserRequestDTO userDTO);
    String delete(Integer id);
}
