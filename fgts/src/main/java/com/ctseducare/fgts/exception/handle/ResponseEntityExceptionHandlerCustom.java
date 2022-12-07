package com.ctseducare.fgts.exception.handle;

import java.net.ConnectException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.ctseducare.fgts.exception.ResourceNotFoundException;
import com.ctseducare.fgts.exception.response.ExceptionResponse;

@ControllerAdvice
public class ResponseEntityExceptionHandlerCustom extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public final ResponseEntity<ExceptionResponse> handleResourceNotFoundExceptions(Exception ex, WebRequest request) {
        ExceptionResponse exceptionResponse = new ExceptionResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage());
        return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
    }
    
    @ExceptionHandler(ConnectException.class)
    public final ResponseEntity<ExceptionResponse> handleConnectExceptions(Exception ex, WebRequest request) {
        ExceptionResponse exceptionResponse = new ExceptionResponse(HttpStatus.BAD_GATEWAY.value(), ex.getMessage());
        return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_GATEWAY);
    }

}