package com.example.Modelclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller
{
	@Autowired
	abiservice as;
	
	List<student> l1=new ArrayList<student>(Arrays.asList(new student("Abi",21,01,"i18n"),(new student("Balu",23,02,"i18n"))));
	
	@RequestMapping("/hello")
	
	public List<student> display()
	{
		return l1;
		
	}
	
	
//	GET
	@RequestMapping(method=RequestMethod.GET,value="/data/{nam}")
	public student display1(@PathVariable String nam)
	{
		return as.getservice(nam);
	}
	
	
// POST	
	@RequestMapping(method=RequestMethod.POST,value="/data")
	public void add(@RequestBody student s)
	{
		as.addstudent(s);
	}
	
//	PUT
@RequestMapping(method=RequestMethod.PUT,value="/data/{nam}")
	
	public void update(@PathVariable String nam,@RequestBody student s1)
	{
		as.updatamystudent(nam, s1);
	}

//DELETE
@RequestMapping(method=RequestMethod.DELETE,value="/data/{nam}")

public void deletestudent(@PathVariable String nam)
{
	as.deletestudent(nam);
}
}