package br.com.petfriendly.DAO.impl;

import org.springframework.stereotype.Repository;

import br.com.petfriendly.DAO.AnimalDao;

import br.com.petfriendly.bean.Animal;


@Repository
public class AnimalDaoImpl  extends GenericDaoImpl<Animal, Integer> implements AnimalDao{

}
