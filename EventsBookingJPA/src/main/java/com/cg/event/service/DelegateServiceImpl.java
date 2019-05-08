package com.cg.event.service;
import java.security.Provider.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.cg.event.dao.EventRepository;
import com.cg.event.dao.EventRepositoryImpl;
import com.cg.event.dto.Delegate;
import com.cg.event.dto.Event;
import com.cg.event.exception.DelegateException;
import com.cg.event.util.DBUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.cg.event.dao.EventRepository;
import com.cg.event.dao.EventRepositoryImpl;
import com.cg.event.dto.Delegate;
import com.cg.event.dto.Event;
import com.cg.event.exception.DelegateException;
import com.cg.event.util.DBUtil;

	public class DelegateServiceImpl implements DelegateService
	{
		Event e =new Event();
		EventRepository dao;
//		Map<Delegate,Event> hm = new HashMap<Delegate,Event>();
		public DelegateServiceImpl() {
			dao= new EventRepositoryImpl();	
		}
		public Delegate registerDelegate(Delegate delegate) throws DelegateException    //register delegate
		{				
			if(dao.save(delegate)==true)
			return delegate;
			else 
				throw new DelegateException("Delegate not added!");
		}
		public Event registerEvent(Event event) throws DelegateException 	//register event
		{				
			if(dao.save(event)==true)
			return event;
			else 
				throw new DelegateException("event not added!");
		}
		public List<Event> showEvents() throws DelegateException 			//show events
		{	return dao.showAllEvents();	
		}
		public List<Delegate> showDelegates() throws DelegateException		//show delegates
		{	return dao.showAllDelegates();
		}
		public Event eventInfo(Event event) throws DelegateException 		//display details about events
		{	
			List<Event> show=showEvents();
			for (Event event2 : show) {
				if(event.getEventName().equals(event2.getEventName())) {
					return event2;
				}
			}
			return null;	
		}
		
		
		
		
		
		
	}
	