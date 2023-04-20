package com.devsuperior.dslearnbds.services.exceptions;

public class ForbiddenException extends RuntimeException{

    private static final long seriaLVersionUID = 1L;

    public ForbiddenException(String msg) {
        super(msg);
    }
}