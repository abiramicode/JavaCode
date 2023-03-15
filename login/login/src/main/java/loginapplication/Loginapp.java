package loginapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(basePackages = "loginapplication")

@SpringBootApplication
public class Loginapp{

	public static void main(String[] args) {
		SpringApplication.run(Loginapp.class, args);
	}

}
