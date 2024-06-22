package com.TicketTransition;

import com.TicketTransition.enums.TicketState;
import com.TicketTransition.model.Ticket;
import com.TicketTransition.model.User;
import com.TicketTransition.service.TicketService;

public class Main {

    public static void main(String[] args) {
        /*
        * User can create a ticket
        * User - name
        * Ticket - id, User createdBy, TicketState (ANALYSIS, DONE, REVIEW)
        * Ticket - Ticket createTicket(User, description), moveTicketState();
        *
        *
        * The code is implemented using state design pattern and
        * */

        TicketService ticketService = new TicketService();
        Ticket ticket = ticketService.createTicket(new User("User 1"), "Ticket 1");

        try {
            ticketService.changeTicketState(ticket, TicketState.NOT_IMPLEMENTED);
        } catch (Exception exception) {
            System.out.println("Error while changing state " + exception);
        }
    }
}
