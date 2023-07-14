package com.zimttech.diabeticscreening.utils;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class ErrorResponse {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private Date timestamp;
    private int code;
    private String message;

    public ErrorResponse(String message) {
        this.message = message;
        timestamp = new Date();
    }
}
