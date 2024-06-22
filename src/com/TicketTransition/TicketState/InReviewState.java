package com.TicketTransition.TicketState;

import com.TicketTransition.model.Ticket;

public class InReviewState implements TicketState{

    private static final com.TicketTransition.enums.TicketState inReviewStateEnum = com.TicketTransition.enums.TicketState.IN_REVIEW;

    private static InReviewState inReviewState = null;

    public static InReviewState getInstance( ) {
        if (inReviewState == null) {
            inReviewState = new InReviewState();
        }
        return inReviewState;
    }

    @Override
    public boolean transitionToTODO(Ticket ticket) {
        System.out.println("Transitioning ticket with Id: " + ticket.getId() + " from state " + inReviewStateEnum + " to Todo ");
        return true;
    }

    @Override
    public boolean transitionToInReview(Ticket ticket) {
        return true;
    }

    @Override
    public boolean transitionToDone(Ticket ticket) {
        System.out.println("Transitioning ticket with id " + ticket.getId() + " from "  + inReviewStateEnum + " to done state");
        ticket.setTicketState(new DoneState());
        return true;
    }
}
