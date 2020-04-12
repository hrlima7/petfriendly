package br.com.petfriendly.DAO.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import br.com.petfriendly.DAO.EstabelecimentoDao;
import br.com.petfriendly.DAO.ProprietarioDao;
import br.com.petfriendly.bean.Estabeleciento;
import br.com.petfriendly.bean.Proprietario;


@Repository
public class EstabelecimentoDaoImpl extends GenericDaoImpl<Estabeleciento, Integer> implements EstabelecimentoDao{

	public List<Estabeleciento> ListaPorNome(){
		
		
		return	em.createQuery("from Estabeleciento order by nomeEstabelecimento").getResultList();
	}

}
