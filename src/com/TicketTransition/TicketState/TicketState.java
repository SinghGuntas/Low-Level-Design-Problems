package com.TicketTransition.TicketState;

import com.TicketTransition.exceptions.InvalidTicketStateException;
import com.TicketTransition.model.Ticket;

public interface TicketState {
    default boolean transitionToTODO(Ticket ticket) {
        return true;
    }

    default boolean transitionToInReview(Ticket ticket) throws InvalidTicketStateException {
        return true;
    }

    default boolean transitionToDone(Ticket ticket) throws InvalidTicketStateException {
        return true;
    }
}
