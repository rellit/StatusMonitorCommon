package de.timherbst.statusserver.model;

import java.util.List;


public class Task {
	private String className;
	private String kunde;
	private String bereich;
	private List<Property> properties;

	public Task(String className, List<Property> properties) {
		super();
		this.className = className;
		this.properties = properties;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public List<Property> getProperties() {
		return properties;
	}

	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}

	public String getKunde() {
		return kunde;
	}

	public void setKunde(String kunde) {
		this.kunde = kunde;
	}

	public String getBereich() {
		return bereich;
	}

	public void setBereich(String bereich) {
		this.bereich = bereich;
	}

	
	
	

}