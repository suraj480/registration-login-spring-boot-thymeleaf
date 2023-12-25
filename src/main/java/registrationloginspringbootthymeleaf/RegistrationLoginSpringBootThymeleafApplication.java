package registrationloginspringbootthymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("registrationloginspringbootthymeleaf")
@ComponentScan(basePackages = {"registrationloginspringbootthymeleaf.model","registrationloginspringbootthymeleaf.repository","registrationloginspringbootthymeleaf.UserService","registrationloginspringbootthymeleaf.web","registrationloginspringbootthymeleaf.web.dto"})
@EnableJpaRepositories(basePackages = {"registrationloginspringbootthymeleaf.model","registrationloginspringbootthymeleaf.repository","registrationloginspringbootthymeleaf.UserService","registrationloginspringbootthymeleaf.web","registrationloginspringbootthymeleaf.web.dto"})
public class RegistrationLoginSpringBootThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrationLoginSpringBootThymeleafApplication.class, args);
	}

}
