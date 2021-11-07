package com.example.exc.exception;
import org.springframework.web.bind.annotation.ResponseStatus;
 import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.GetMapping;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)             //это ошибка 500
public class IntServErrException extends InternalError {         //класс IntServErrException наследует InternalError
}
