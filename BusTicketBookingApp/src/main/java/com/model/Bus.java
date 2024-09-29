package com.model;

import java.util.ArrayList;
import java.util.List;


public class Bus {
	
	private int busNo;
	private String busType;
	private String source;
	private String destination;
	private int noOfSeatsAvailable;
	private List<Integer> rating=new ArrayList<Integer>();
	public int getBusNo() {
		return busNo;
	}
	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getNoOfSeatsAvailable() {
		return noOfSeatsAvailable;
	}
	public void setNoOfSeatsAvailable(int noOfSeatsAvailable) {
		this.noOfSeatsAvailable = noOfSeatsAvailable;
	}
	public List<Integer> getRating() {
		return rating;
	}
	public void setRating(List<Integer> rating) {
		this.rating = rating;
	}
	public Bus(int busNo, String busType, String source, String destination, int noOfSeatsAvailable,
			List<Integer> rating) {
		super();
		this.busNo = busNo;
		this.busType = busType;
		this.source = source;
		this.destination = destination;
		this.noOfSeatsAvailable = noOfSeatsAvailable;
		this.rating = rating;
	}
	public Bus() {
		super();
	}
	
	
	

}
