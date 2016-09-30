package com.model;

import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

public class Users {

	
	private  int Userid;
	
	private String Firstname;
	
	private String Lastname;
	
	private String Address;
	
	private String Emailid;
	
	private String Password;
	
	@Transient 
	private MultipartFile Photo;

	public int getUserid() {
		return Userid;
	}

	public void setUserid(int userid) {
		Userid = userid;
	}

	public String getFirstname() {
		return Firstname;
	}   

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getEmailid() {
		return Emailid;
	}

	public void setEmailid(String emailid) {
		Emailid = emailid;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public MultipartFile getPhoto() {
		return Photo;
	}

	public void setPhoto(MultipartFile photo) {
		Photo = photo;
	}
	
	
	
	
	
}
