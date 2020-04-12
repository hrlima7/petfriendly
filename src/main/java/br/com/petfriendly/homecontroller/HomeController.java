package br.com.petfriendly.homecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index() {
		
		
		return "home/index";
	}
	
	
	@GetMapping("estabelecimento")
	public String listarEstabelecimento() {
		
		return "estabelecimento/estab";
	}
	

}
