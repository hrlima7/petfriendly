package br.com.petfriendly.homecontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.petfriendly.DAO.AnimalDao;
import br.com.petfriendly.bean.Animal;

@Controller
@RequestMapping("animal")
public class AnimalController {

	@Autowired
	AnimalDao dao;
	
	
		@GetMapping("listar")
		public ModelAndView listar() {
			
			
			return new ModelAndView("/animal/lista").addObject("animal", dao.listar());
		}
	
		@GetMapping("/cadastro")
		public String cadastro() {
			
			return "/animal/cadastro";
		}
	
	
		@Transactional
		@PostMapping("cadastrar")
		public ModelAndView cadastrar(Animal animal, RedirectAttributes att) {
			
			try {
				
				dao.cadastrar(animal);
			}
			catch(Exception e){
			    	
			
			   	 return new ModelAndView("cadastro/cadastro").addObject("msg", "erro");
				 
			}
			 att.addFlashAttribute("msg", "Animal cadastrado");
			 return new ModelAndView("redirect:listar");
		}
	
}
