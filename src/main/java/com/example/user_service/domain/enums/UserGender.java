package com.example.user_service.domain.enums;

import lombok.Getter;

@Getter
public enum UserGender {
    MALE(1),
    FEMALE(2),
    ;

    UserGender(int i) {
    }
}
