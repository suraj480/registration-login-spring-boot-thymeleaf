package registrationloginspringbootthymeleaf.UserService;

import registrationloginspringbootthymeleaf.model.User;
import registrationloginspringbootthymeleaf.web.dto.UserRegistrationDto;

public interface UserService {
User save(UserRegistrationDto registrationDto);
}
