package com.spotifyclone.error;

import com.spotifyclone.entities.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value = {UserNotFoundException.class})
    public ResponseEntity<ErrorMessage> handleUserNotFoundException(Exception e, WebRequest request) {
        ErrorMessage errorMessage = new ErrorMessage(e.getMessage(), HttpStatus.NOT_FOUND);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
    }

    @ExceptionHandler(value = {SongNotFoundException.class})
    public ResponseEntity<ErrorMessage> handleSongNotFoundException(Exception e, WebRequest request) {
        ErrorMessage errorMessage = new ErrorMessage(e.getMessage(), HttpStatus.NOT_FOUND);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
    }

    @ExceptionHandler(value = {AuthenticationFailedException.class})
    public ResponseEntity<ErrorMessage> handleAuthFailedException(Exception e, WebRequest request) {
        ErrorMessage errorMessage = new ErrorMessage(e.getMessage(), HttpStatus.UNAUTHORIZED);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
    }

    @ExceptionHandler(value = {UserAlreadyRegisteredException.class})
    public ResponseEntity<ErrorMessage> handleUserAlreadyRegisteredException(Exception e, WebRequest request) {
        ErrorMessage errorMessage = new ErrorMessage(e.getMessage(), HttpStatus.BAD_REQUEST);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
    }
}
