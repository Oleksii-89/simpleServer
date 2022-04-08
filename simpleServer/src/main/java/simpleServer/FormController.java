package simpleServer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormController {
	
	

	@GetMapping("/user")
	public String showUsersJsp () {
		
		return "users-list";
	}
	
	
	
	@GetMapping("/userJson")
	public String showUsersJson () {
		
		return "users-json";
	}
}
