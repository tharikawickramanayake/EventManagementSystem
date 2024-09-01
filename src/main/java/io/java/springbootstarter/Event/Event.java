package io.java.springbootstarter.Event;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Event {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String eventKind;
	private String eventName;
	private String description;
	
	public Event() {
		
	}

	public Event(String eventKind, String eventName, String description) {
		super();
		this.eventKind = eventKind;
		this.eventName = eventName;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEventKind() {
		return eventKind;
	}

	public void setEventKind(String eventKind) {
		this.eventKind = eventKind;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	 
	}
	
	 
	
