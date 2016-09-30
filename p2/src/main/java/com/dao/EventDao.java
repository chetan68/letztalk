package com.dao;

import java.awt.Event;
import java.util.List;

public interface EventDao {

	public List<Event> list();

	public Event getevent(int Eventid);

	public int insertRow(Event event);
	
	public int  updateRow(Event event);

	public int deleteRow(int Eventid);

}
