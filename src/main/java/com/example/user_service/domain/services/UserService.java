package com.example.user_service.domain.services;

import com.example.user_service.domain.dtos.CreateUserRequestDTO;
import com.example.user_service.domain.dtos.UpdateUserRequestDTO;
import com.example.user_service.domain.dtos.UserDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserDTO get(Long id);
    Object update(Long id,UpdateUserRequestDTO userDTO);
    String delete(Long id);
    Object info();
}
