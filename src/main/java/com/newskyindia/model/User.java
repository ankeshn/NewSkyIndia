package com.newskyindia.model;



import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User{
	
	
	private String emailid;
	private String name;
	private String username;
	private String password;
	private String role;
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	public User(String emailid, String name, String username, String password, String role) {
		super();
		this.emailid = emailid;
		this.name = name;
		this.username = username;
		this.password = password;
		this.role = role;
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "User [emailid=" + emailid + ", name=" + name + ", username=" + username + ", password=" + password
				+ ", role=" + role + "]";
	}
	
	
	
	
}
