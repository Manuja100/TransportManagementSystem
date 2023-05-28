package com.customer;

public class customer {
	private int cusID; 
	private String firstName;
	private String lastName; 
	private String email; 
	private String username; 
	private String password;
	private String phoneNum;
	private String sequrityQuestion;
	
	
	//Constructor for customer class
	public customer(int cusID, String firstName, String lastName, String email, String username, String password,
			String phoneNum, String sequrityQuestion) {
		
		this.cusID = cusID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.password = password;
		this.phoneNum = phoneNum;
		this.sequrityQuestion = sequrityQuestion;
		
	}


	public int getCusID() {
		return cusID;
	}


	


	public String getFirstName() {
		return firstName;
	}


	


	public String getLastName() {
		return lastName;
	}


	


	public String getEmail() {
		return email;
	}


	


	public String getUsername() {
		return username;
	}


	


	public String getPassword() {
		return password;
	}


	


	public String getPhoneNum() {
		return phoneNum;
	}


	


	public String getSequrityQuestion() {
		return sequrityQuestion;
	}



	
	
	
	
	
	
	
	
}
