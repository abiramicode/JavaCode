package com.example.demoabi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class abicontroller {
	
@Autowired							//loosely coupled //not obj(its a instance of service class)

	
	abiservice as;    					// or abiservice as =new abiservice();   //create object  //tightly coupled------>abiservice depends on abicontroller class
	@RequestMapping("/abi")
	public String display()
	{
		return as.showservice();		//as.showservice- instead they get obj need from outside world/source /class -->call @Component class i.e IOC
	}
	
		
}
