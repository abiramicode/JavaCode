package com.abc.dto;

import java.io.Serializable;

public class Book implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer bid;
	private String bname;
	private Float bcost;
	
	public Book() {
		System.out.println("HIBERNATE USES THE CONSTRUCTOR");
		}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public Float getBcost() {
		return bcost;
	}

	public void setBcost(Float bcost) {
		this.bcost = bcost;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", bcost=" + bcost + "]";
	}	

}
