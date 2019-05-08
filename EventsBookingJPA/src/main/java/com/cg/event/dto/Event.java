package com.cg.event.dto;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="event")
public class Event{
	@Id
	@Column(name="event_id")
	private int id;
	@Column(name="event_name")
	private String eventName;
	@Column(name="event_date")
	private Date date;
	@Column(name="event_city")
	private String city;
	public Event() {}
	
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public Event(int id, String eventName, Date date, String city) {
		super();
		this.id = id;
		this.eventName = eventName;
		this.date = date;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", eventName=" + eventName + ", date=" + date + ", city=" + city + "]";
	}
	
	/*@Override
	public String toString() {
		return "\nEvent [eventName=" + eventName + ", date=" + date.getDate()+"-"+date.getMonth() +"-"+(date.getYear()+1900)+ ", city=" + city + "]";
	}	*/				
}
