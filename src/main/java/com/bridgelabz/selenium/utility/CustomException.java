package com.bridgelabz.selenium.utility;


public class CustomException extends Exception{

    ExceptionType type;
    public enum ExceptionType {
        FILE_NOT_FOUND,
    }

    public CustomException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
