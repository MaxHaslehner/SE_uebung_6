package com.example.tasks;
import java.util.Date;

public class Task{
	
	private String name;
	private Date endDate;
	private boolean complete;
	
	public Task(String name, Date endDate){
		this.name = name;
		this.endDate = endDate;
		this.complete = false;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setIsComplete(boolean complete){
		this.complete = complete;
	}
	
}
