package com.example.Modelclass;

public class student {

	private String name;
	private int age;
	private int rollno;
	private String college;
	
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public student(String name, int age, int rollno, String college) {
		super();
		this.name = name;
		this.age = age;
		this.rollno = rollno;
		this.college = college;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}
	
}