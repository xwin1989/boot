package com.chancetop.demo.exception;

/**
 * @author Neal
 */
public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
}
