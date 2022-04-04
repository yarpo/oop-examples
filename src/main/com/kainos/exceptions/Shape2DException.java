package com.kainos.exceptions;

/**
 * This is how you want to make your exceptions more specific.
 *
 * Exception class is just a class like any other.
 * You can extend it to build your own hierarchy of exceptions.
 * */
public class Shape2DException extends RuntimeException {

    public Shape2DException(String msg) {
        super(msg);
    }
}
