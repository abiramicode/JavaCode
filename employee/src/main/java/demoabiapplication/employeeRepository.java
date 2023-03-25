package demoabiapplication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component

public interface employeeRepository extends JpaRepository<employee, Long  > 
{

	employee findByName(String nam);
		
}


