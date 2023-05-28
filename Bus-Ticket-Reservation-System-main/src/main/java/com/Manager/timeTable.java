package com.Manager;

public class timeTable {

	private int timeid ;
	private int busid ;
	private int routeId;
	private String start;
	private String reach;
	private String status;
	private String date;
	private int price;
	
	
	public timeTable(int timeid,int busid, int routeId, String start, String reach, String date, String status,int price) {
		
		this.timeid = timeid;
		this.busid = busid;
		this.routeId = routeId;
		this.start = start;
		this.reach = reach;
		this.status = status;
		this.date = date;
		this.price = price;
	}
	
	
	public int gettimeid() {
		return timeid;
	}


	public int getBusid() {
		return busid;
	}


	

	public int getRouteId() {
		return routeId;
	}


	public String getStart() {
		return start;
	}


	

	public String getReach() {
		return reach;
	}


	

	public String getStatus() {
		return status;
	}


	

	public String getDate() {
		return date;
	}


	public int getPrice() {
		return price;
	}

	
	
	

}
