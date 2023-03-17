package com.abc.model;

import java.io.Serializable;

public class Student implements Serializable 
{
	
	private static final long serialVersionUID = 1L;  //default ver give otherwise cannot give serialization facility
	
	private Integer sid;
	private String sname;
	private String saddress;
	
	public Student() {
		System.out.println("ZERO ARGUMENT CONSTRUCTOR USED BY HIBERNATE");
	}

	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

}
