package com.spring.cache.dto;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
* @author Abhishek.Singh
* @spring_version 2.4.1
* @java_verison 1.8
*/

@Data
@AllArgsConstructor
public class ResponseDto {
	
	private String data;
	private String message;
	private HttpStatus status;
	private int statusCode;
	
	public ResponseDto(String data, String message) {
		this(data, message, HttpStatus.OK, HttpStatus.OK.value());
	}
	
	public ResponseDto(String message, HttpStatus status) {
		this(null, message, status, status.value());
	}
}
