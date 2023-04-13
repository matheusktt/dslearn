package com.devsuperior.dslearnbds.services.exceptions;

public class DatabaseException extends RuntimeException{
    private static final long seriaLVersionUID = 1L;

    public DatabaseException(String msg) {
        super(msg);
    }
}