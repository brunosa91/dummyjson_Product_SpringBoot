package com.example.demo.cross;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.Instant;

@RestControllerAdvice
public class ResourceExceptionHandler extends RuntimeException  {

	
	@ExceptionHandler(EntityNotFoundException.class)
	public ResponseEntity<StandarError> resourceNotFound(EntityNotFoundException e){
		String error = "Pequisa não encontrada";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandarError err = new StandarError(Instant.now(),status.value(),error,e.getMessage());
		return ResponseEntity.status(status).body(err);
	
	}
	

	

	
	
}
