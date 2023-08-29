package com.customer.manage.exception;

import org.springframework.http.HttpStatus;

public class productNotFound extends RuntimeException {
	 public productNotFound(String message){
		    super(message);
		  }

	/*
	 * @Override public HttpHeaders getResponseHeaders() { // return response
	 * headers }
	 */
}
