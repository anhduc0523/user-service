package com.example.user_service.application.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseException extends RuntimeException{
    private Error error;
    private String[] errorTemplate;

    public BaseException(Error error, String... errorTemplate) {
        super(error.getMessage());
        this.error = error;
        this.errorTemplate = errorTemplate;
    }
}
