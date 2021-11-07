package com.example.exc.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.GetMapping;

@ResponseStatus(HttpStatus.NOT_FOUND)        // это ошибка 404
//@ResponseStatus (HttpStatus.INTERNAL_SERVER_ERROR)

public class NotFoundRuntimeException extends RuntimeException {     //класс NotFoundRuntimeException наследует RuntimeException

}
//Internal Server Error