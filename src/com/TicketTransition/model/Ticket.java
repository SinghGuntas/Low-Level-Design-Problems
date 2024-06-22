package com.TicketTransition.model;


import com.TicketTransition.TicketState.TicketState;
import com.TicketTransition.TicketState.TodoState;

import java.time.LocalDateTime;
import java.util.UUID;

public class Ticket {
    private final String id;
    private TicketState ticketState;
    private final User createdBy;
    private final LocalDateTime createdAt;

    public Ticket(User createdBy, LocalDateTime createdAt) {
        this.id = UUID.randomUUID().toString();
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        ticketState = new TodoState();
    }

    public String getId() {
        return id;
    }

    public TicketState getTicketState() {
        return ticketState;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setTicketState(TicketState ticketState) {
        this.ticketState = ticketState;
    }
}
