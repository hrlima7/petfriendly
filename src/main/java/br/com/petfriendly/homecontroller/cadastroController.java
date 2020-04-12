package br.com.petfriendly.homecontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.petfriendly.DAO.AnimalDao;
import br.com.petfriendly.DAO.ProprietarioDao;
import br.com.petfriendly.bean.Animal;
import br.com.petfriendly.bean.Proprietario;


@Controller
@RequestMapping("cadastro")
public class cadastroController  {
	
	@Autowired
    ProprietarioDao  dao;
	
	@Autowired
	AnimalDao aDao;
	



	
   @ModelAttribute("animal")
   public List<Animal>listar (Animal animal) {
		
		return  aDao.listar() ;
	}
	
	

	
	@GetMapping("cadastrar")
	public String cadastrar() {
		
		
		return "cadastro/cadastro";
	}
	

	@Transactional
	@PostMapping("cadastrar")
	public ModelAndView processarForm(Proprietario proprietario, RedirectAttributes redirect) {
	 
		try {
	    dao.cadastrar(proprietario);
	    
		}
		catch(Exception e) {
			 return new ModelAndView("cadastro/cadastro").addObject("msg", "erro");
	 
		}
		 redirect.addFlashAttribute("msg", "Usuario cadastrado");
		 return new ModelAndView("redirect:/");
	}


	
	

}
