package com.cg.event.dao;

import com.cg.event.dto.Event;
import com.cg.event.exception.DelegateException;
import com.cg.event.util.DBUtil;
import com.cg.event.dto.Delegate;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import com.cg.event.dto.Delegate;

public class EventRepositoryImpl implements EventRepository {
	EntityManager em;
	public EventRepositoryImpl() {
		em=DBUtil.getConnection();
	}
	@Override
	public boolean save(Delegate name) throws DelegateException {
		em=DBUtil.getConnection();
		em.persist(name);
		em.getTransaction().commit();
		return true;
	}
	@Override
	public List<Event> showAllEvents() throws DelegateException {
		em=DBUtil.getConnection();
		TypedQuery<Event> query=em.createQuery("select e from Event e",Event.class);
		List<Event> eventlist=query.getResultList();
		em.getTransaction().commit();
		em.close();
		return eventlist;
	}
	@Override
	public List<Delegate> showAllDelegates() throws DelegateException {
		em=DBUtil.getConnection();
		TypedQuery<Delegate> query=em.createQuery("select d from Delegate d",Delegate.class);		
		List<Delegate> delegatelist=query.getResultList();
		em.getTransaction().commit();
		em.close();
		return delegatelist;
	}
	@Override
	public boolean save(Event name) throws DelegateException {		
		em=DBUtil.getConnection();
		em.persist(name);
		em.getTransaction().commit();
		em.close();
		return true;
	}
	
}
