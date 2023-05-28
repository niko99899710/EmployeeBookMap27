package com.example.employeebook;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployeeNotFindException extends RuntimeException{
    public EmployeeNotFindException(String message) {
        super(message);
    }

    public EmployeeNotFindException(String message, Throwable cause) {
        super(message, cause);
    }
}
