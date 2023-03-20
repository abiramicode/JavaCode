package com.example.demoabi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class abicontroller2 {
	
@Autowired							//loosely coupled //not obj(its a instance of service class)

abiservice as1;    					// or abiservice as =new abiservice();   //create object  //tightly coupled------>abiservice depends on abicontroller class
		@RequestMapping("/abii")
		public String display1()
		{
			return as1.showservice2();		//as.showservice- instead they get obj need from outside world/source /class -->call @Component class i.e IOC
		}
		
	
}
