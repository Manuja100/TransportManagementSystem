package com.customer;

public class Driver {
	
	private int driverID;
	private String name;
	private String dob;
	private String email;
	private String nic;
	private String phone;
	private String pass;
	
	public Driver(int driverID, String name, String dob, String email, String nic, String phone, String pass) {

		this.driverID = driverID;
		this.name = name;
		this.dob = dob;
		this.email = email;
		this.nic = nic;
		this.phone = phone;
		this.pass = pass;
	}

	public int getDriverID() {
		return driverID;
	}

	

	public String getName() {
		return name;
	}

	

	public String getDob() {
		return dob;
	}

	
	public String getEmail() {
		return email;
	}



	public String getNic() {
		return nic;
	}

	
	public String getPhone() {
		return phone;
	}


	public String getPass() {
		return pass;
	}


	
	
	
	
	

}
