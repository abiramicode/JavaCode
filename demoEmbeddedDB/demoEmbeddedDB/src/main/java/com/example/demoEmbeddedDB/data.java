package com.example.demoEmbeddedDB;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class data {

	@Id
	
	 String name;
	 String department;
	 int age;
	 String institution;
	 
	 
	 public data(String name, String department, int age, String institution) {
		super();
		this.name = name;
		this.department = department;
		this.age = age;
		this.institution = institution;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getInstitution() {
		return institution;
	}


	public void setInstitution(String institution) {
		this.institution = institution;
	}
	
}
