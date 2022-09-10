package com.tdtu.cosmetics.exception;

public class UserIdNotFoundException extends RuntimeException{
    public UserIdNotFoundException()
    {
        super("User Id Not Found");
    }
}
