package com.cg.event.ui;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import com.cg.event.dao.EventRepository;
import com.cg.event.dto.Address;
import com.cg.event.dto.Delegate;
import com.cg.event.dto.Event;
import com.cg.event.exception.DelegateException;
import com.cg.event.service.DelegateService;
import com.cg.event.service.DelegateServiceImpl;
import com.cg.event.util.DBUtil;
import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Main
{
	public static void main(String[] args) throws DelegateException
	{		
		Scanner sc=new Scanner(System.in);	
		List<Event> events = new ArrayList<>();
		Random rand = new Random(); 
		int randomvalue = rand.nextInt(10000000); 
	//	final Logger LOGGER = Logger.getLogger("EventLogger");   
	//	int rand_id=0; 
	//	rand_id++;
		DelegateService service=new DelegateServiceImpl();		
		System.out.println("\nEnter your name");
		String name=sc.nextLine();
		
		System.out.println("Enter Address : building name");
		String building=sc.nextLine();
		
		System.out.println("Enter street");
		String street=sc.nextLine();
		
		System.out.println("Enter city");
		String city=sc.nextLine();
		
		System.out.println("Enter the name of the event you want to attend");
		String eventname=sc.nextLine();
		
		System.out.println("Enter the event date in dd-mm-yyyy format");
		
		String dates=sc.next();

		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		Date date=null;
		try {
			date = dateFormat.parse(dates);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
							
		System.out.println("Enter the city where event is being hosted");
		String eventcity=sc.next();
		
		Event eventone=new Event(randomvalue,eventname,date,city);								 //register event
		//service.registerEvent(eventone);
		events.add(eventone);
		
		Delegate d=new Delegate(randomvalue,name,new Address(randomvalue, building,street,city),events);
		System.out.println(service.registerDelegate(d));                              			 //register and display delegate	
			
		System.out.println("\nThe events available are");
		List <Event> showevents=service.showEvents();											 //show all events
		System.out.println(showevents);
		
		System.out.println("\nEnter the event name for more details");  						 //displaying event info
		String eventdetail=sc.next();
		Event e=new Event();
		e.setEventName(eventdetail);
		Event eventlist=service.eventInfo(e);
		System.out.println(eventlist);
		
		
		
	}
}