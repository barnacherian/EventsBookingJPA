package com.cg.event.dao;

import java.util.List;

import com.cg.event.dto.Delegate;
import com.cg.event.dto.Event;
import com.cg.event.exception.DelegateException;

public interface EventRepository
{
	boolean save(Delegate name) throws DelegateException;
	boolean save(Event name) throws DelegateException;
	List<Event> showAllEvents() throws DelegateException;
	List<Delegate> showAllDelegates() throws DelegateException;
	
}
