/*

package com.Java23_WebServices_GritAcademyAPI_Nikolina_Vikberg.courses;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleException(Exception ex) {
        Map<String, Object> body = new HashMap<>();
        body.put("message", "Nothing was found, check your spelling or try with different number/spelling");

        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }
}


 */