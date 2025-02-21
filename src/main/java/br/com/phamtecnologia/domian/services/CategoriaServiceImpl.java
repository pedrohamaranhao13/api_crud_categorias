package br.com.phamtecnologia.domian.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.phamtecnologia.domian.entities.Categoria;
import br.com.phamtecnologia.domian.interfaces.CategoriaService;
import br.com.phamtecnologia.dtos.CategoriaResponseDto;
import br.com.phamtecnologia.repositories.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService{

	@Autowired
	CategoriaRepository categoriaRepository;
	
	@Override
	public void create(CategoriaResponseDto dto) throws Exception {
		
		Categoria categoria = new Categoria();
		categoria.setId(UUID.randomUUID());
		categoria.setNome(dto.getNome());
		
		categoriaRepository.save(categoria);
		
	}

	@Override
	public void update(Categoria categoria) throws Exception {
		categoriaRepository.save(categoria);
		
	}

	@Override
	public void delete(UUID id) throws Exception {
		Categoria categoria = findById(id);
		categoriaRepository.delete(categoria);
		
	}

	@Override
	public List<Categoria> findAll() throws Exception {
		return categoriaRepository.findAll();
	}

	@Override
	public Categoria findById(UUID id) throws Exception {
		return categoriaRepository.findById(id).get();
	}

}
