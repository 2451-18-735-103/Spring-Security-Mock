package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Bus;

@Service
public class BusService {

	private static List<Bus> busList=new ArrayList<Bus>();

	public BusService() {
		List<Integer> rating=new ArrayList<Integer>();
		rating.add(4);rating.add(2);rating.add(3);
		List<Integer> rating1=new ArrayList<Integer>();
		rating1.add(5);rating1.add(3);rating1.add(4);
		List<Integer> rating2=new ArrayList<Integer>();
		rating2.add(5);rating2.add(3);rating2.add(1);
		busList.add(new Bus(5345,"AC","Chennai","Bangalore", 20,rating));
		busList.add(new Bus(2345,"NonAC","Coimbatore","Bangalore", 12,rating));
		busList.add(new Bus(5005,"AC","Chennai","Coimbatore", 2,rating));
		busList.add(new Bus(8845,"NonAC","Chennai","Madurai", 0,rating));
		busList.add(new Bus(3345,"NonAC","Madurai","Salem", 4,rating));
		busList.add(new Bus(9345,"AC","Salem","Erode", 15,rating));
	}
	public static List<Bus> getBusList() {
		return busList;
	}

	public static void setBusList(List<Bus> busList) {
		
		BusService.busList = busList;
	}
	
	public Bus addBus(Bus b) {
		busList.add(b);
		return b;
	}
	
	public Bus updateBus(int busNo, int noOfSeatsAvailable) {
		for(Bus bus:busList) {
			if(bus.getBusNo()==busNo)
			{
				bus.setNoOfSeatsAvailable(noOfSeatsAvailable);
				return bus;
			}
		}
		return null;
	}
	
	
	public Bus viewBusBySourceAndDestination(String source, String destination){
		for(Bus bus:busList) {
			if(bus.getSource().equalsIgnoreCase(source) && bus.getDestination().equalsIgnoreCase(destination))
			{
				return bus;
			}
		}
		return null;
	}
	
	public List<Bus> viewAllBusRating()
	{
		return busList;
	}
	
	public Bus provideRating(int busNo, int rating){
		for(Bus bus:busList) {
			if(bus.getBusNo()==busNo)
			{
				bus.getRating().add(rating);
				return bus;
			}
		}
		return null;
	}
}
