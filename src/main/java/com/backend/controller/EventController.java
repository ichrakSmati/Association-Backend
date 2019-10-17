package com.backend.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.backend.models.Event;
import com.backend.models.Tag;
import com.backend.models.User;
import com.backend.service.EventService;
import com.backend.service.TagService;

@RestController
@RequestMapping("/event")
@CrossOrigin("*")
public class EventController {

	@Autowired
	EventService eventService;
	 
	@Autowired
	TagService tagService;
	
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
		if (event.getTags()!=null){
			List<Tag> tags= new ArrayList<Tag>();
			for (Tag tag : event.getTags()) {
				if (!tagService.findByName(tag).isPresent())
					tagService.commit(tag);
				else
					tag=tagService.findByName(tag).get();
				tags.add(tag);
			}
			event.setTags(tags);
		}
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
	
	@RequestMapping(value="/addParticipant/{eventId}", method=RequestMethod.POST)
	public ResponseEntity<?> addParticipant(@PathVariable int eventId, @RequestBody User participant){
		eventService.addPariticpant(eventId, participant);
		 return ResponseEntity.ok(eventId+" particiant added");
	}
}
