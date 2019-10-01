package com.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.dao.EventRepository;
import com.backend.models.Event;

@Service(value= "eventService")
public class EventServiceImp implements EventService{

	@Autowired
	EventRepository eventRepository;

	@Override
	public List<Event> getAll() {
		return eventRepository.findAll();
	}

	@Override
	public Event commit(Event event) {
		return eventRepository.save(event);
	}

	@Override
	public void delete(int id) {
		eventRepository.deleteById(id);
		
	}

	@Override
	public Event find(int id) {
		return eventRepository.getOne(id);
	}
	
	
}
