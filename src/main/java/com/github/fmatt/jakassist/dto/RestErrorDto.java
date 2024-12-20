package com.github.fmatt.jakassist.dto;

public class RestErrorDto {

    private String message;

    public RestErrorDto(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
