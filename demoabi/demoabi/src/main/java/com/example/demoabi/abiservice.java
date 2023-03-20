package com.example.demoabi;

import org.springframework.stereotype.Component;

@Component		//or @Service ---> which object to call in a class(abiservice.class)---as or as1 obj??

public class abiservice {
	
	public String showservice()
	{
		return "hi abi this is from service class";
	}
	
	public String showservice2()
	{
		return "hello abi from service class!!";
	}
	
}







