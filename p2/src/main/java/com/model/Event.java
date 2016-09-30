package com.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Event {
	
	private int Eventid;
	
	private String Eventname;
	
	private String Eventdate;
	
	private String Eventtime;
	
	private int Postedbyid; 
	  
	private String  EventDesc;
	
	private int UserById;

	public int getEventid() {
		return Eventid;
	}

	public void setEventid(int eventid) {
		Eventid = eventid;
	}

	public String getEventname() {
		return Eventname;
	}

	public void setEventname(String eventname) {
		Eventname = eventname;
	}

	public String getEventdate() {
		return Eventdate;
	}

	public void setEventdate(String eventdate) {
		Eventdate = eventdate;
	}

	public String getEventtime() {
		return Eventtime;
	}

	public void setEventtime(String eventtime) {
		Eventtime = eventtime;
	}

	public int getPostedbyid() {
		return Postedbyid;
	}

	public void setPostedbyid(int postedbyid) {
		Postedbyid = postedbyid;
	}

	public String getEventDesc() {
		return EventDesc;
	}

	public void setEventDesc(String eventDesc) {
		EventDesc = eventDesc;
	}

	public int getUserById() {
		return UserById;
	}

	public void setUserById(int userById) {
		UserById = userById;
	}

}
