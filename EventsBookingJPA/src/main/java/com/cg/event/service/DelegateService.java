package com.cg.event.service;
import java.util.List;
import com.cg.event.dto.Delegate;
import com.cg.event.dto.Event;
import com.cg.event.exception.DelegateException;
import java.util.List;
import com.cg.event.dto.Delegate;
import com.cg.event.dto.Event;
import com.cg.event.exception.DelegateException;
public interface DelegateService{
	Delegate registerDelegate (Delegate delegate) throws DelegateException;
	List<Event>showEvents() throws DelegateException;	
	List<Delegate> showDelegates() throws DelegateException;
	Event eventInfo(Event event) throws DelegateException;
	Event registerEvent(Event event) throws DelegateException;
	
}
