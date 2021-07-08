package com.chancetop.demo.exception;

/**
 * @author Neal
 */
public class BookNotFoundException extends NotFoundException{
    public BookNotFoundException(String message) {
        super(message);
    }
}
