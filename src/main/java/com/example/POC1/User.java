package com.example.POC1;

import org.springframework.data.mongodb.core.mapping.Document;

// login credential
@Document(collection = "User")
public class User {
	private String username;
	private String pwd;
	private String service;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return pwd;
	}
	public void setPassword(String password) {
		this.pwd = pwd;
	}
	public String getservice() {
		return service;
	}
	public void setservice(String service) {
		this.service = service;
	}
	public User(String username, String pwd) {
		super();
		this.username = username;
		this.pwd = pwd;
	}
	
} 
