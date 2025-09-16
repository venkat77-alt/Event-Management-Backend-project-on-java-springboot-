package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Event;

public interface EventService {
    Event saveEvent(Event event);
    List<Event> getAllEvents();
    Event getEventById(Long id);
    Event updateEvent(Event event, Long id);
    void deleteEvent(Long id);
}
