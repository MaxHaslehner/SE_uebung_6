package com.example.tasks;
import java.util.Date;
import java.util.List;
import java.util.LinkedList;

public class TaskDatabase{
	
	private List<Task> availableTasks;
	
	public TaskDatabase(){
		this.availableTasks = new LinkedList<Task>();
	}
	
	public void addTask(String name, Date endDate ){
		Task task = new Task(name, endDate);
	}
	
	public Task getTask(String name){
		for(Task t: availableTasks){
			if(t.getName() == name){
				return t;
			}
		}
		return null;
	}
	
	public void completeTask(String name){
		Task t = getTask(name);
		t.setIsComplete(false);
	}
}
