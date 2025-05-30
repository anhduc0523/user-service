package com.example.user_service.domain.services.impl;

import com.example.user_service.database.repositories.UserRepository;
import com.example.user_service.domain.dtos.CreateUserRequestDTO;
import com.example.user_service.domain.dtos.UpdateUserRequestDTO;
import com.example.user_service.domain.dtos.UserDTO;
import com.example.user_service.domain.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public Object create(CreateUserRequestDTO userDTO) {
        // Implement the logic to create a user
        return null;
    }

    @Override
    public UserDTO get(Long id) {
        // Implement the logic to get a user by ID
        userRepository.getReferenceById(id);
        return null;
    }

    @Override
    public Object update(Long id, UpdateUserRequestDTO userDTO) {
        // Implement the logic to update a user
        return null;
    }

    @Override
    public String delete(Long id) {
        // Implement the logic to delete a user by ID
        return null;
    }
}
