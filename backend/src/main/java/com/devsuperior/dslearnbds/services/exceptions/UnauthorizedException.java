package com.devsuperior.dslearnbds.services.exceptions;

public class UnauthorizedException extends RuntimeException{
    private static final long seriaLVersionUID = 1L;

    public UnauthorizedException(String msg) {
        super(msg);
    }
}