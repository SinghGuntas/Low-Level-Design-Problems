package com.TicketTransition.TicketState;

import com.TicketTransition.exceptions.InvalidTicketStateException;
import com.TicketTransition.model.Ticket;

public class TodoState implements TicketState {

    private final static com.TicketTransition.enums.TicketState ticketState = com.TicketTransition.enums.TicketState.TODO;

    private static TodoState todoState = null;

    public static TodoState getInstance() {
        if (todoState == null) {
            todoState = new TodoState();
        }
        return todoState;
    }

    @Override
    public boolean transitionToTODO(Ticket ticket) {
        System.out.println("Ticket state transition not allowed");
        return false;
    }

    @Override
    public boolean transitionToInReview(Ticket ticket) throws InvalidTicketStateException {
        System.out.println("Transitioning ticket with id " + ticket.getId() + " from "  + ticketState + " to in review state");
        ticket.setTicketState(TicketStateFactory.getInstance(ticketState));
        return true;
    }

    @Override
    public boolean transitionToDone(Ticket ticket) throws InvalidTicketStateException {
        System.out.println("Transitioning ticket with id " + ticket.getId() + " from "  + ticketState + " to in done");
        ticket.setTicketState(TicketStateFactory.getInstance(ticketState));
        return true;
    }
}
