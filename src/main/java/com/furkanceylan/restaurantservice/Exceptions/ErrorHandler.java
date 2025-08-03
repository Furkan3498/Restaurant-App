package com.furkanceylan.restaurantservice.Exceptions;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorHandler {

          @ExceptionHandler(NotFoundException.class)
            public ResponseEntity<ErrorResponse> handler(NotFoundException ex){
              ErrorResponse errorResponse = new ErrorResponse();
              errorResponse.setMessage(ex.getMessage());
              errorResponse.setCode("NOT_FOUND");
              return ResponseEntity.status(404).body(errorResponse);
          }


}
