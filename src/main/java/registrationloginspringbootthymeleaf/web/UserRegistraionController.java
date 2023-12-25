package registrationloginspringbootthymeleaf.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import registrationloginspringbootthymeleaf.UserService.UserService;
import registrationloginspringbootthymeleaf.web.dto.UserRegistrationDto;

@Controller
@RequestMapping("/registration")
public class UserRegistraionController {

	private UserService userService;
	public UserRegistraionController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		userService.save(registrationDto);
		return "redirect:/registraion?success";
	}
	
	
}
