package com.niit.collaboration.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import oracle.sql.BLOB;

@Entity
@Table(name = "C_User_Details")
@Component
public class User extends BaseDomain
  {
	
	
	@Id
	private String id;
	
    private String username;
	
	private String password;
	
	private String address;
	
	private String mail;
	
	private String mobile;
	
	private String role;
	
	private String gender;
	
	private String dob;
	
	private char status;
	
	private char isonline;
	
	private BLOB image;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public char getIsonline() {
		return isonline;
	}

	public void setIsonline(char isonline) {
		this.isonline = isonline;
	}

	public BLOB getImage() {
		return image;
	}

	public void setImage(BLOB image) {
		this.image = image;
	}

	
	
	
	

}
