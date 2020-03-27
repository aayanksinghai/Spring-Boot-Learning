package com.project.LoggingMan.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "User")
public class User 
{
	
	
	@Id
	@NotNull
	private String email;
	@NotNull
	private String name;
	@NotNull
	private String city;
	@NotNull
	private String password;
	
	public User()
	{
		
	}
	
	public User(String email, String name, String city, String password) {
		super();
		this.email = email;
		this.name = name;
		this.city = city;
		this.password = password;
	}

	

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [email=" + email + ", name=" + name + ", city=" + city + ", password=" + password + ", getEmail()="
				+ getEmail() + ", getName()=" + getName() + ", getCity()=" + getCity() + ", getPassword()="
				+ getPassword() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

}
