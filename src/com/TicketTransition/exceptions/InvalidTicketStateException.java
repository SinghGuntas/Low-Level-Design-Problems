package com.TicketTransition.exceptions;

public class InvalidTicketStateException extends Exception{
    public InvalidTicketStateException(String message) {
        super("Ticket State not valid");
    }
}
