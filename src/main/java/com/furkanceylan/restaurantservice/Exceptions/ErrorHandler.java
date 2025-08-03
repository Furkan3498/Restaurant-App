package com.furkanceylan.restaurantservice.Exceptions;


import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
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

        @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handler(Exception ex){
              ErrorResponse response = new ErrorResponse();
              response.setMessage("An unexpected error occurred");
              response.setCode("INTERNAL_SERVER_ERROR");
              return ResponseEntity.status(500).body(response);
        }
        @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
        public ResponseEntity<ErrorResponse> handler(HttpRequestMethodNotSupportedException exception){
              ErrorResponse response = new ErrorResponse();
              response.setMessage("Method not allowed : " +exception.getMethod());
              response.setCode("METHOD_NOT_ALLOWED");
              return ResponseEntity.status(405).body(response);
        }
    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    public ResponseEntity<ErrorResponse> handler(HttpMediaTypeNotSupportedException exception){
        ErrorResponse response = new ErrorResponse();
        response.setMessage("Unsupported media type : " +exception.getContentType());
        response.setCode("UNSUPPORTED_MEDİA_TYPE");
        return ResponseEntity.badRequest().body(response);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<ErrorResponse> handler(HttpMessageNotReadableException exception){
        ErrorResponse response = new ErrorResponse();
        response.setMessage("Malformed JSON request "  );
        response.setCode("MALFORMED_JSON");
        return ResponseEntity.status(405).body(response);
    }

        @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handler(MethodArgumentNotValidException ex){
              ErrorResponse errorResponse = new ErrorResponse();
              errorResponse.setMessage("Validation failed : " + ex.getBindingResult().getFieldError().getDefaultMessage());
            errorResponse.setCode("VALIDATION_ERROR");
            return ResponseEntity.badRequest().body(errorResponse);
        }
}
