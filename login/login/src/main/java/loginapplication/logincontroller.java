package loginapplication;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class logincontroller {
	
	
	@Autowired						
	loginRepository log;
	

@RequestMapping("/mylogin")

 public List<loginn> display()
 {
	  return log.findAll();
 }
 
 
/*@RequestMapping("/mylogin/{nam}")			// this is post method check below postmethod---refer employee module
 
 public void add(@RequestBody loginn l1)
 {
	 log.save(l1);
	 
 }
*/
 

/*// POST	
@RequestMapping(method=RequestMethod.POST,value="/mylogin/{nam}")
public void add1(@RequestBody loginn l1)
{
	log.save(l1);
}*/
 
}