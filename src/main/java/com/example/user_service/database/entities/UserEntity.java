package com.example.user_service.database.entities;

import com.example.user_service.domain.enums.UserGender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity(name = "user")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @Column(name = "keycloak_id")
    String keycloakId;

    @Column(name = "name")
    String name;

    @Column(name = "email")
    String email;

    @Column(name = "phone")
    String phone;

    @Column(name = "address")
    String address;

    @Column(name = "age")
    Integer age;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    UserGender gender;

    @Column(name = "avatar")
    String avatar;
}
