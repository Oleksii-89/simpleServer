package simpleServer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {
	
	
	@GetMapping("/")
	public String selectForm () {
		
		return "mein-menu";
	}
	
	
	

}
