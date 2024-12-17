package com.felipe.helpdesk.resources.exceptions;

import com.felipe.helpdesk.domain.enums.Status;
import com.felipe.helpdesk.services.exceptions.DataIntegrityViolationException;
import com.felipe.helpdesk.services.exceptions.ObjectNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFoundException(ObjectNotFoundException ex, HttpServletRequest request){
        StandardError error = new StandardError(request.getRequestURI(), ex.getMessage(), "Object not found",
                HttpStatus.NOT_FOUND.value(), System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<StandardError> dataIntegrityViolationException(DataIntegrityViolationException ex, HttpServletRequest request){
        StandardError error = new StandardError(request.getRequestURI(), ex.getMessage(), "Violação de dados",
                HttpStatus.BAD_REQUEST.value(), System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
    }

}
