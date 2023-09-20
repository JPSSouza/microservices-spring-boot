package br.com.erudio.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.erudio.dto.PersonDTO;
import br.com.erudio.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{

	@Override
	public List<PersonDTO> getAll() {
		
		return mockListPerson();
		
		
	}

	private List<PersonDTO> mockListPerson() {
		
		List<PersonDTO> list = new ArrayList<PersonDTO>();
		
		for (int i = 0; i < 8; i++) {
		
			PersonDTO p1 = new PersonDTO();
			p1.setIdade(23 + i);
			p1.setNome("Nome " + i );
			p1.setSexo("Feminino " +i);
			p1.setId(i);
			
			list.add(p1);
		
		}
		
		return list;
		
	}

	
	@Override
	public PersonDTO getPerson(Integer id){
		
		PersonDTO p1 = new PersonDTO();
		p1.setIdade(23);
		p1.setNome("Maria Maria");
		p1.setSexo("Feminino");
		p1.setId(id);
		return p1;
	}
	
	
	

}
