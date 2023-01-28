package com.natwest.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(code=HttpStatus.CONFLICT, reason= "Email address already exist")
public class CustomerAlreadyRegisteredException extends Exception{

}
