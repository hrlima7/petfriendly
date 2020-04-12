package br.com.roma.web;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.com.petfriendly.DAO.AnimalDao;
import br.com.petfriendly.bean.Animal;



@Component
public class StringToAnimalConverter implements Converter<String, Animal> {
	
	@Autowired
	private AnimalDao service;

	
	public Animal convert(String text) {
		if (text.isEmpty()) {
			return null;
		}
		Long id = Long.valueOf(text);
		return service.buscar(id);
	}

}