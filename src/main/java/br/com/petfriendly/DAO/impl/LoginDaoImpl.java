package br.com.petfriendly.DAO.impl;


import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.petfriendly.DAO.LoginDao;
import br.com.petfriendly.DAO.ProprietarioDao;
import br.com.petfriendly.bean.Proprietario;

	@Repository
	public class LoginDaoImpl extends GenericDaoImpl<Proprietario, Integer> implements LoginDao {

		
		public boolean valida(String nome, String senha) {
			
			
			return em.createQuery(" \"select p from Proprietario e where \"\n" + 
					"				+ \"p.nome = :nome and\n" + 
					"                    + \"p.senha = :senha\")\n" + 
					"				.setParameter(\"nome\", nome)\n" + 
					"				.setParameter(\"senha\", senha)\n" + 
					"				.getSingleResult();").equals(true);
		}
		
	}

	
	
