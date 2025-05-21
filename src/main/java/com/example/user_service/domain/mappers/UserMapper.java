package com.example.user_service.domain.mappers;

import com.example.user_service.database.entities.UserEntity;
import com.example.user_service.domain.dtos.CreateUserRequestDTO;
import com.example.user_service.domain.dtos.UpdateUserRequestDTO;
import com.example.user_service.domain.dtos.UserDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO entityToDto(UserEntity userEntity);

    UserEntity dtoToEntity(UserDTO userDTO);

    UserEntity createDTOToEntity(CreateUserRequestDTO userDTO);

    UserEntity updateDTOToEntity(UpdateUserRequestDTO userDTO);
}
