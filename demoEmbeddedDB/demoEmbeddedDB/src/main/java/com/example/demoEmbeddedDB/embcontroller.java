package com.example.demoEmbeddedDB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class embcontroller {

	@Autowired
	embservice ser;
	
	@RequestMapping(method=RequestMethod.GET,value="/myabi")
	
	public List<data> displayall()
	{
		return ser.displayall();
	}
	
    @RequestMapping(method=RequestMethod.GET,value="/myabi{nam}")
	
	public data displaysingle(@PathVariable String nam)
	{
		return ser.displayone(nam);
	}
    @RequestMapping(method=RequestMethod.POST,value="/myabi{nam}")
	
   	public void addempl(@RequestBody data d,@PathVariable String nam)
   	{
   		 ser.addemp(d,nam);
   	}
   @RequestMapping(method=RequestMethod.PUT,value="/myabi{nam}")
	
   	public void updateemp(@RequestBody data d,@PathVariable String nam)
   	{
   		 ser.updateemp(d,nam);
   	}
   @RequestMapping(method=RequestMethod.DELETE,value="/myabi{nam}")
	
  	public void deleteemp(@RequestBody data d,@PathVariable String nam)
  	{
  		 ser.deleteeemp(nam);
  	}
    
}