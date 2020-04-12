package br.com.petfriendly.homecontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.petfriendly.DAO.EstabelecimentoDao;
import br.com.petfriendly.DAO.impl.EstabelecimentoDaoImpl;
import br.com.petfriendly.bean.Estabeleciento;
import br.com.petfriendly.bean.Proprietario;

@Controller
@RequestMapping("estabelecimento")
public class EstabelecimentoController {
	
	@Autowired
	EstabelecimentoDaoImpl daoImpl;
	
	@Autowired
	EstabelecimentoDao dao;

	
	
	@GetMapping("preEstabelecimento")
	public ModelAndView listar () {
		
		return  new ModelAndView("estabelecimento/estab").addObject("estabelecimento",dao.listar());
	}
	
	
	@GetMapping("cadastrar")
	public String cadastrar() {
		
		
		return "estabelecimento/cadastro";
	}
	
	
	@Transactional
	@PostMapping("cadastrarestab")
	public ModelAndView processarForm(Estabeleciento estabelecimento, RedirectAttributes redirect) {
	 
		try {
	    dao.cadastrar(estabelecimento);
	    
		}
		catch(Exception e) {
			 return new ModelAndView("estabelecimento/preEstabelecimento").addObject("msg", "erro");
	 
		}
		 redirect.addFlashAttribute("msg", "Empresa Cadastrada");
		 return new ModelAndView("redirect:preEstabelecimento");
	}
	
	@GetMapping("listarpornome")
	public ModelAndView Listarpornome(){
		
		
		return new ModelAndView("estabelecimento/estab").addObject("estabelecimento", daoImpl.ListaPorNome());
	}
	
	
	
	
	
	
	
	
	
	
	
}
