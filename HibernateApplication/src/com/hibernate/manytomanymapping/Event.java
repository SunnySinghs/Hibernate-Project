package com.hibernate.manytomanymapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Event {

	private int eventId;
	private String eventName;
	private List<Delegates> ld = new ArrayList<Delegates>();
	@Id
	@GeneratedValue
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	@ManyToMany
	@JoinTable(name="Event_Delegation_Mapping", joinColumns={@JoinColumn(name="eventId")},
				inverseJoinColumns={@JoinColumn(name="delegateId")})
	public List<Delegates> getLd() {
		return ld;
	}
	public void setLd(List<Delegates> ld) {
		this.ld = ld;
	}
	
	
}
