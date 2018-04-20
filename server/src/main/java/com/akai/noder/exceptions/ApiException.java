package com.akai.noder.exceptions;

import org.springframework.http.HttpStatus;

public class ApiException extends Exception {
    private HttpStatus httpStatus;

    public ApiException(HttpStatus httpStatus, String message) {
        super(message);
        this.httpStatus = httpStatus;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
