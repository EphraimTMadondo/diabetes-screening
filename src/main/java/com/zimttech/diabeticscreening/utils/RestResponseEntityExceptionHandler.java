package com.zimttech.diabeticscreening.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler{
    @ExceptionHandler(value = PatientNotFoundException.class)
    public ResponseEntity<Object> exception(PatientNotFoundException exception) {
        return new ResponseEntity<>("Patient with requested ID doest not exist", HttpStatus.NOT_FOUND);
    }
}
