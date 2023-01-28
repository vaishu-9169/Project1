package com.natwest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.BAD_REQUEST, reason ="User doesn't exists with these credentials")
public class CustomerNotFoundException extends Exception{

}
