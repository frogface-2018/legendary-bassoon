package com.bean;

public class Login {
	
      private String email;
      private String password;
      private String typeOfUser;
      
      
      
      
	public String getTypeOfUser() {
		return typeOfUser;
	}
	public void setTypeOfUser(String typeOfUser) {
		this.typeOfUser = typeOfUser;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Login(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
      
    
	

}
