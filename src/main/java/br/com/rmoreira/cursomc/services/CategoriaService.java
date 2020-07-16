package br.com.rmoreira.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rmoreira.cursomc.domain.Categoria;
import br.com.rmoreira.cursomc.repositories.CategoriaRepository;
import br.com.rmoreira.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj =  categoriaRepository.findById(id);
		
		return obj.orElseThrow( () -> new ObjectNotFoundException(
					"Objeto não encontrado! Id: "+ id +", Tipo: "+ Categoria.class.getName()));
	}

}
