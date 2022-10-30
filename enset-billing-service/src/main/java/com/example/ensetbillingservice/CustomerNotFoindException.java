package com.example.ensetbillingservice;

public class CustomerNotFoindException extends RuntimeException {
    public CustomerNotFoindException(String message) {
        super(message);
    }
}
