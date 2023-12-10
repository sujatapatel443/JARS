package com.web.dto;

public class RegisterDto {
	
	private String name;
	private String uname;
	private String pwd;
	private String cpwd;
	private String gender;
	public RegisterDto() {
		
	}
	public RegisterDto(String name, String uname, String pwd, String cpwd, String gender) {
		super();
		this.name = name;
		this.uname = uname;
		this.pwd = pwd;
		this.cpwd = cpwd;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getCpwd() {
		return cpwd;
	}
	public void setCpwd(String cpwd) {
		this.cpwd = cpwd;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	

}
