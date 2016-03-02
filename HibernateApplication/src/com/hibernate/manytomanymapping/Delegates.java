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
public class Delegates {

	private int delegateId;
	private String delegateName;
	private List<Event> le = new ArrayList<Event>();
	@Id
	@GeneratedValue
	public int getDelegateId() {
		return delegateId;
	}
	public void setDelegateId(int delegateId) {
		this.delegateId = delegateId;
	}
	public String getDelegateName() {
		return delegateName;
	}
	public void setDelegateName(String delegateName) {
		this.delegateName = delegateName;
	}
	@ManyToMany
	@JoinTable(name="Event_Delegation_Mapping", joinColumns={@JoinColumn(name="delegateId")},
				inverseJoinColumns={@JoinColumn(name="eventId")})
	public List<Event> getLe() {
		return le;
	}
	public void setLe(List<Event> le) {
		this.le = le;
	}
	
}
