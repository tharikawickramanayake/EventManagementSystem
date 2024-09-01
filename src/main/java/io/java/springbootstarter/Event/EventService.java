package io.java.springbootstarter.Event;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

	@Autowired
	private EventRepository eventRepository;
	
	public List<Event> getAllEvent(){
		return (List<Event>) eventRepository.findAll();
	}
	
	public Optional<Event> getEvent(int id){
		return eventRepository.findById(id);
	}
	
	public void addEvent(Event event) {
		 eventRepository.save(event);
	}
	
	public void updateEvent(int id, Event event) {
		event.setId(id);
		eventRepository.save(event);
	}
	
	public void deleteEvent(int id) {
		eventRepository.deleteById(id);
	}
}
