package com.TicketTransition.service;

import com.TicketTransition.TicketState.TicketStateFactory;
import com.TicketTransition.enums.TicketState;
import com.TicketTransition.exceptions.InvalidTicketStateException;
import com.TicketTransition.model.Ticket;
import com.TicketTransition.model.User;

import java.time.LocalDateTime;

public class TicketService {

    public Ticket createTicket(User user, String description) {
        return new Ticket(user, LocalDateTime.now());
    }

    public void changeTicketState(Ticket ticket, TicketState ticketState) throws Exception {
        switch(ticketState) {
            case TODO:
                ticket.getTicketState().transitionToTODO(ticket);
                break;
            case IN_REVIEW:
                ticket.getTicketState().transitionToInReview(ticket);
                break;
            case DONE:
                ticket.getTicketState().transitionToDone(ticket);
                break;
        }
        throw new Exception("Ticket state not handled");
    }

}
