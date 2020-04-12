package br.com.petfriendly.homecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

		@GetMapping("/dashborad")
		public String login() {
			
			
			return "/acesso";
		}
	
	
		
		
		
}
