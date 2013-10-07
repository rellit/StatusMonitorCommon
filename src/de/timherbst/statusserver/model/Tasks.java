package de.timherbst.statusserver.model;

import java.util.ArrayList;
import java.util.List;


public class Tasks {
	private List<Task> tasks;

	public Tasks() {
//		tasks = new ArrayList<Task>();
//		List<Property> properties = new ArrayList<Property>();
//		properties.add(new Property("key", "value"));
//		properties.add(new Property("key2", "value2"));
//		properties.add(new Property("key3", "value3"));
//		tasks.add(new Task("className", properties));
//		tasks.add(new Task("className2", properties));
	}
	
	public List<Task> getTasks() {
		return tasks;
	}
	
	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
}