package br.com.erudio.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import br.com.erudio.dto.PersonDTO;


public interface PersonService {

	public List<PersonDTO> getAll();
	
	
	public PersonDTO getPerson(Integer id);
	
}
