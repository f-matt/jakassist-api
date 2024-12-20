package com.github.fmatt.jakassist.util;

import jakarta.ejb.ApplicationException;

@ApplicationException
public class CustomRuntimeException extends RuntimeException {

    public CustomRuntimeException(String message) {
        super(message);
    }

}
