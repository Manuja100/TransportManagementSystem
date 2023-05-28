package com.Driver;

public class DriverSalary {
	
	
	private int sal_id ;
	private String sal_date;
	private String sal_amount;
	private int driver_id;
	
	
	public DriverSalary(int sal_id, String sal_date, String sal_amount, int driver_id) {
		
		this.sal_id = sal_id;
		this.sal_date = sal_date;
		this.sal_amount = sal_amount;
		this.driver_id = driver_id;
	}


	public int getSal_id() {
		return sal_id;
	}


	public void setSal_id(int sal_id) {
		this.sal_id = sal_id;
	}


	public String getSal_date() {
		return sal_date;
	}


	public void setSal_date(String sal_date) {
		this.sal_date = sal_date;
	}


	public String getSal_amount() {
		return sal_amount;
	}


	public void setSal_amount(String sal_amount) {
		this.sal_amount = sal_amount;
	}


	public int getDriver_id() {
		return driver_id;
	}


	public void setDriver_id(int driver_id) {
		this.driver_id = driver_id;
	}
	

}
