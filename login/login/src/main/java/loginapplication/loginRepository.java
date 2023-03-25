package loginapplication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component

public interface loginRepository extends JpaRepository<loginn, Integer> 
{


}
