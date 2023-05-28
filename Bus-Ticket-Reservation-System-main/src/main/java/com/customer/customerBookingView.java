package com.customer;

public class customerBookingView {
	private String regNo; 
	private String departure_time;
	private String arrival_time; 
	private String start_point;
	private String destination; 
	private String type;
	private String service; 
	private String price;
	private String status;
	
	public customerBookingView(String regNo, String departure_time, String arrival_time, String start_point,
			String destination, String type, String service, String price, String status) {
		
		this.regNo = regNo;
		this.departure_time = departure_time;
		this.arrival_time = arrival_time;
		this.start_point = start_point;
		this.destination = destination;
		this.type = type;
		this.service = service;
		this.price = price;
		this.status = status;
	}

	public String getRegNo() {
		return regNo;
	}

	public String getDeparture_time() {
		return departure_time;
	}

	public String getArrival_time() {
		return arrival_time;
	}

	public String getStart_point() {
		return start_point;
	}

	public String getDestination() {
		return destination;
	}

	public String getType() {
		return type;
	}

	public String getService() {
		return service;
	}

	public String getPrice() {
		return price;
	}

	public String getStatus() {
		return status;
	}
	
	
}
