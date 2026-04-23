package com.spring.Security.dto;

import java.io.Serializable;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class AuthDto implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotNull
	@NotEmpty
	@NotBlank(message = "Name is mandatory")
	private String userName;
	@NotNull
	@NotEmpty
	@NotBlank(message = "password is mandatory")
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "AuthDto [userName=" + userName + ", password=" + password + "]";
	}
	
	

}
