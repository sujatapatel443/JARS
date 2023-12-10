package com.web.dto;

public class LoginDto {
	private String uname;
	private String password;
	
	public LoginDto() {
		
	}
	public LoginDto(String uname, String password) {
		
		this.uname = uname;
		this.password = password;
	}
	public String getUname() {
		return uname;
	}
	public void setName(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
