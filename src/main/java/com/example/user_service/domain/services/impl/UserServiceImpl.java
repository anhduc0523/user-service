package com.example.user_service.domain.services.impl;

import com.example.user_service.database.entities.UserEntity;
import com.example.user_service.database.repositories.UserRepository;
import com.example.user_service.domain.dtos.CreateUserRequestDTO;
import com.example.user_service.domain.dtos.UpdateUserRequestDTO;
import com.example.user_service.domain.dtos.UserDTO;
import com.example.user_service.domain.mappers.UserMapper;
import com.example.user_service.domain.services.UserService;
import com.example.user_service.utils.CommonUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

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

    @Override
    public Object info() {
        String userId = CommonUtils.getUserId();
        Optional<UserEntity> user = userRepository.findByKeycloakId(userId);

        if (user.isPresent()) {
            UserEntity userEntity = user.get();
            return userMapper.entityToDto(userEntity);
        }

        // Handle the case where the user is not found
        UserEntity userEntity = new UserEntity();
        userEntity.setKeycloakId(userId);
        Jwt jwt = (Jwt) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Map<String, Object> claims = jwt.getClaims();
        userEntity.setEmail(claims.get("email").toString());
        userEntity.setFirstName(claims.get("given_name").toString());
        userEntity.setLastName(claims.get("family_name").toString());
        userRepository.save(userEntity);
        return userMapper.entityToDto(userEntity);
    }
}
