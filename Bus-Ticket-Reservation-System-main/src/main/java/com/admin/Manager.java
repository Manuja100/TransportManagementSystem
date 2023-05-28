package com.admin;

public class Manager {
	private int empID; 
	private String name;
	private String email; 
	private String phone; 
	private String password;
	private String position;
	
	
	//Constructor for Manager class
	public Manager(int empID, String name, String email, String phone, String password,String position) {
		
		this.empID = empID;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.position = position;
		
	}


	public int getEmpID() {
		return empID;
	}


	

	public String getName() {
		return name;
	}



	public String getEmail() {
		return email;
	}




	public String getPhone() {
		return phone;
	}


	

	public String getPassword() {
		return password;
	}


	


	public String getPosition() {
		return position;
	}


	
}
