package demoabiapplication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class employeecontroller {
	
	
	@Autowired
	employeeRepository eser;
	
 @RequestMapping("/myemployee")

 public List<employee> findall()
 {
	return eser.findAll();
 }
   
 @RequestMapping("/myemployee/{nam}")
 
 public employee findByName(@PathVariable String nam)
 {
	 return eser.findByName(nam);
	 
 }
 
 @RequestMapping(method =RequestMethod.POST,value="/myemployee")
 
 public void add(@RequestBody employee e1)
 {
	 eser.save(e1);
 }
 
}

