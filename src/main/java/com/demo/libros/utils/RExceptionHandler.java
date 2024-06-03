package com.demo.libros.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class RExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(LibroException.class)
    public ResponseEntity<ExceptionResponse> handleLibroException(LibroException ex) {
        ExceptionResponse response = new ExceptionResponse("Error en libro", ex.getMessage());
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
