package com.goldfish.datastar.springboot.web.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.goldfish.datastar.springboot.web.model.Event;

@Service
public class EventService {
    private static List<Event> events = new ArrayList<Event>();
    private static int eventCount = 3;

    static {
        events.add(new Event(1, "goldfish", "Learn Spring MVC", new Date(),
                false));
        events.add(new Event(2, "goldfish", "Learn Struts", new Date(), false));
        events.add(new Event(3, "goldfish", "Learn Hibernate", new Date(),
                false));
        events.add(new Event(4, "goldfish", "Learn Angular", new Date(),
                false));        
        events.add(new Event(5, "goldfish", "Learn Spring-Boot", new Date(),
                false));  
    }

    public List<Event> retrieveEvents(String user) {
        List<Event> filteredEvents = new ArrayList<Event>();
        for (Event event : events) {
            if (event.getUser().equalsIgnoreCase(user)) {
                filteredEvents.add(event);
            }
        }
        return filteredEvents;
    }
    
    public Event retrieveEvent(int id) {
        for (Event event : events) {
            if (event.getId()==id) {
                return event;
            }
        }
        return null;
    }

    public void updateEvent(Event event){
    		events.remove(event);
    		events.add(event);
    }

    public void addEvent(String name, String desc, Date targetDate,
            boolean isDone) {
        events.add(new Event(++eventCount, name, desc, targetDate, isDone));
    }

    public void deleteEvent(int id) {
        Iterator<Event> iterator = events.iterator();
        while (iterator.hasNext()) {
            Event event = iterator.next();
            if (event.getId() == id) {
                iterator.remove();
            }
        }
    }
}