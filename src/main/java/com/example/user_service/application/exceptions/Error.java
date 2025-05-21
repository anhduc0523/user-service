package com.example.user_service.application.exceptions;

import lombok.Getter;

@Getter
public enum Error {
    BAD_REQUEST(400,"Bad request"),

    NOT_FOUND_USER(404,"Not found lesson %s"),

    PAYLOAD_TOO_LARGE(413,"Payload too large"),
    ;

    Error(int statusCode,String message) {
        this.message = message;
        this.statusCode = statusCode;
    }

    private final String message;
    private final int statusCode;
}
