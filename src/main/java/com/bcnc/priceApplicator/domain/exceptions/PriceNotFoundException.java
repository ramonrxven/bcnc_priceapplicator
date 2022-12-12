package com.bcnc.priceApplicator.domain.exceptions;

public class PriceNotFoundException extends RuntimeException{
    public PriceNotFoundException(String message)
    {
        super(message);
    }
}
