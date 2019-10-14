package com.backend.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backend.dao.EventRepository;
import com.backend.models.Event;
import com.backend.models.User;

@Service(value= "eventService")
public class EventServiceImp implements EventService{

	@Autowired
	EventRepository eventRepository;

	@Override
	public List<Event> getAll() {
		return eventRepository.findAll();
	}
	
	@Override
	public List<Event> getAllActivated() {
		return eventRepository.findAll().stream()               
				.filter(quiz -> quiz.getEtat()==true)   
				.collect(Collectors.toList());
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

	
	@Override
	public List<Event> filter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addPariticpant(int eventId, User participant) {
		Event event= eventRepository.getOne(eventId);
		event.getParticipants().add(participant);
		eventRepository.save(event);
		
	}
	
	
	
}
