package com.example.employeebook;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployeeAllredyAddException extends RuntimeException {
    public EmployeeAllredyAddException(String message) {
        super(message);
    }

    public EmployeeAllredyAddException(String message, Throwable cause) {
        super(message, cause);
    }
}
