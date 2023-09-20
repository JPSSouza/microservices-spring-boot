package br.com.erudio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.dto.PersonDTO;
import br.com.erudio.service.impl.PersonServiceImpl;

@RestController
public class PersonController {
	
	private final PersonServiceImpl service;
	
	@Autowired
	PersonController(PersonServiceImpl service){
		this.service = service;
	}

	@RequestMapping("person/{id}")
	public PersonDTO getPerson(@PathVariable("id") Integer id) {
		return service.getPerson(id);
	}
	
	@RequestMapping("person/")
	public List<PersonDTO> getAll() {
		return service.getAll();
	}
		
}
