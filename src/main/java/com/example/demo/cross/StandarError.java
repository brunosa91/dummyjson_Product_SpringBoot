package com.example.demo.cross;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;
@Getter
@Setter
public class StandarError implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Instant timestamp;
	private Integer status;
	private String error;
	private String message;


	public StandarError() {}

	public StandarError(Instant timestamp, Integer status, String error, String message) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.error = error;
		this.message = message;
		
	}


	
	
}
