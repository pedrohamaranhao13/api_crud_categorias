package br.com.phamtecnologia.domian.interfaces;

import java.util.List;
import java.util.UUID;

import br.com.phamtecnologia.domian.entities.Categoria;
import br.com.phamtecnologia.dtos.CategoriaResponseDto;

public interface CategoriaService {
	
	void create(CategoriaResponseDto dto) throws Exception;
	void update(Categoria categoria) throws Exception;
	void delete(UUID id) throws Exception;
	
	List<Categoria> findAll() throws Exception;
	Categoria findById(UUID id) throws Exception;

}
