package com.goldfish.datastar.springboot.web.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goldfish.datastar.springboot.web.model.Event;

public interface EventRepository extends JpaRepository<Event, Integer>{
	List<Event> findByUserOrderByTargetDateAsc(String user);
	
	//service.retrieveEvents(name)

	//service.deleteEvent(id);
	//service.retrieveEvent(id)
	//service.updateEvent(event)
	//service.addEvent(getLoggedInUserName(model), event.getDesc(), event.getTargetDate(),false);
}
