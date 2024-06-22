package com.parkinglot.interfaces;

import com.parkinglot.models.events.Event;

public interface EventListener {
    void update(Event event);
}
