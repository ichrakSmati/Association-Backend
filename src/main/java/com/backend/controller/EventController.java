package com.backend.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.backend.models.Event;
import com.backend.service.EventService;

@RestController
@RequestMapping("/event")
@CrossOrigin("*")
public class EventController {

	@Autowired
	EventService eventService;
	 
	@RequestMapping(method=RequestMethod.GET)
	public List<Event> getList(){
		return eventService.getAll();
	}
	
	@RequestMapping(value="/activate" , method=RequestMethod.GET)
	public List<Event> getListActivated(){
		return eventService.getAllActivated();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Event add(@RequestBody Event event){
		return eventService.commit(event);
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public Event edit(@RequestBody Event event){
		return eventService.commit(event);
	}
	
	@RequestMapping(method=RequestMethod.DELETE)
	public ResponseEntity<?> delete(@RequestBody int eventId){
		 eventService.delete(eventId);
		 return ResponseEntity.ok(eventId+" deleted");
	}
}
