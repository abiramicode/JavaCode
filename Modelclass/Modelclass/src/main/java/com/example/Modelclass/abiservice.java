package com.example.Modelclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class abiservice {
	
	List<student> l1=new ArrayList<student>(Arrays.asList(new student("Abi",21,01,"i18n"),(new student("Balu",25,02,"i18n"))));
	
	public List<student> getservice()
	{
		return l1;
		
	}
	
	
	
	/*public void add(student s)
	{
		l1.add(s);				//just we assume add method not necessary--->add POST method
	}*/

//	GET
	public student getservice(String nam)
	{
		return l1.stream().filter(t->t.getName().equals(nam)).findFirst().get();
	}

	
	
//	POST
	public void addstudent(student s)
	{
		l1.add(s);
		
	}
	
//	UPDATE
	public void updatamystudent(String nam,student s)
	{
		for(int i=0;i<l1.size();i++)
		{
			student s1=l1.get(i);
			if(s1.getName().equals(nam))
			{
				l1.set(i,s);
			}
		}
	}
	
//	DELETE
	public void deletestudent(String nam) 
	{
	
		l1.removeIf(t->t.getName().equals(nam));
	}
	
	
		
}


