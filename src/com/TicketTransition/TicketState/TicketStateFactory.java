package com.TicketTransition.TicketState;

import com.TicketTransition.exceptions.InvalidTicketStateException;

public class TicketStateFactory {


    public static TicketState getInstance(com.TicketTransition.enums.TicketState ticketState) throws InvalidTicketStateException {
        switch (ticketState) {
            case TODO:
                return TodoState.getInstance();
            case IN_REVIEW:
                return InReviewState.getInstance();
            case DONE:
                return DoneState.getInstance();
        }
        throw new InvalidTicketStateException("Ticket state invalid");
    }

}
