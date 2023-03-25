package demoabiapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "demoabiapplication")
@SpringBootApplication
public class DemoabiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoabiApplication.class, args);
	}

}
