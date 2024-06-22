package com.TicketTransition.TicketState;

import com.TicketTransition.model.Ticket;

public class DoneState implements TicketState {

    private static DoneState doneState = null;

    private static final com.TicketTransition.enums.TicketState currentStateEnum = com.TicketTransition.enums.TicketState.DONE;

    public static DoneState getInstance( ) {
        if (doneState == null) {
            doneState = new DoneState();
        }
        return doneState;
    }

    @Override
    public boolean transitionToTODO(Ticket ticket) {
        System.out.println("Dude WTF happened!");
        return false;
    }

    @Override
    public boolean transitionToInReview(Ticket ticket) {
        System.out.println("Transitioning ticket with id " + ticket.getId() + " from "  + currentStateEnum + " to in review state");
        ticket.setTicketState(new InReviewState());
        return true;
    }

    @Override
    public boolean transitionToDone(Ticket ticket) {
        return true;
    }
}
