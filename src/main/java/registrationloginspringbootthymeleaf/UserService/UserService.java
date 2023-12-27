package registrationloginspringbootthymeleaf.UserService;

import org.springframework.security.core.userdetails.UserDetailsService;

import registrationloginspringbootthymeleaf.model.User;
import registrationloginspringbootthymeleaf.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
User save(UserRegistrationDto registrationDto);
}
