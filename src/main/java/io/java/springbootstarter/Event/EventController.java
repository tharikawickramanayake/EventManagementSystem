package io.java.springbootstarter.Event;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
	
	@Autowired
	private EventService eventService;

	@GetMapping("/events")
	public List<Event> getAllEvent() {
		return eventService.getAllEvent();
	}
	
	@GetMapping("events/{id}")
	public Optional<Event> getEvent(@PathVariable int id){
		return eventService.getEvent(id);
	}
	
	@PostMapping("/events")
	public void addEvent(@RequestBody Event event) {
		eventService.addEvent(event);
	}
	
	@PutMapping("/events/{id}")
	public void updateEvent(@PathVariable int id,@RequestBody Event event) {
		eventService.updateEvent(id, event);
	}
	
	@DeleteMapping("/movies/{id}")
	public void deleteEvent(@PathVariable int id) {
		eventService.deleteEvent(id);
	}
}
