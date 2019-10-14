package com.backend.service;

import java.util.List;

import com.backend.models.Event;
import com.backend.models.User;

public interface EventService {

	List<Event> getAll();
	List<Event> getAllActivated();
	List<Event> filter();
	Event commit(Event event);
	void delete(int id);
	Event find(int id);
	void addPariticpant(int eventId, User participant);
}
