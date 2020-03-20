package com.example.restservice;

public class Greeting {

	
	private long rollno;
	private String name;
	
	
	public Greeting(long rollno, String name)
	{
		this.rollno = rollno;
		this.name = name;
	}
	public long getRollno()
	{
		return rollno;
	}
	public String getName()
	{
		return name;
	}
}

