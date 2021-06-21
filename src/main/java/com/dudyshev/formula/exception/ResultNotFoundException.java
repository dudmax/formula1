package com.dudyshev.formula.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class ResultNotFoundException extends RuntimeException {

    public ResultNotFoundException(String message) {
        super(message);
    }

    public ResultNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
