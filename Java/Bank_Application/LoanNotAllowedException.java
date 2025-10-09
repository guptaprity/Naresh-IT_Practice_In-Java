package com.prity.Custom_Exception;

public class LoanNotAllowedException extends RuntimeException {
    public LoanNotAllowedException(String message) {
        super(message);
    }
}
