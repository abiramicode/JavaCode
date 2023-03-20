package com.example.demoEmbeddedDB;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component

public class embservice {

	@Autowired
	embrepository repo;
	
	public List<data> displayall()
	{
		List<data>l1=new ArrayList<data>();
		repo.findAll().forEach(l1::add);
		return l1;
	}
	
	public data displayone(String nam) {
	
			return repo.findOne(nam);
		}

	public void addemp(data d, String nam)
	{
		
	  repo.save(d);		}

	public void updateemp(data d1, String nam) 
	{
		repo.save(d1);
		
	}

	public void deleteeemp(String nam)
	{
		
		repo.delete(nam);
	}

}