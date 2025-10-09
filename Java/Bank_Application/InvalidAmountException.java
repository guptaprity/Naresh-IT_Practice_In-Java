package com.prity.Custom_Exception;

public class InvalidAmountException extends RuntimeException{
    public InvalidAmountException(String message) {
    	super(message);
    }
}
