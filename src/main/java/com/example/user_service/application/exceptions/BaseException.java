package com.example.user_service.application.exceptions;

import lombok.Getter;
import lombok.Setter;

import java.lang.Error;

@Getter
@Setter
public class BaseException extends RuntimeException{
    private java.lang.Error error;
    private String[] errorTemplate;

    public BaseException(Error error, String... errorTemplate) {
        super(error.getMessage());
        this.error = error;
        this.errorTemplate = errorTemplate;
    }
}
