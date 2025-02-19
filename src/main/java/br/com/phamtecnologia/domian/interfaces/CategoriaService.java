package br.com.phamtecnologia.domian.interfaces;

import java.util.List;
import java.util.UUID;

import br.com.phamtecnologia.domian.entities.Categoria;

public interface CategoriaService {
	
	void create(Categoria categoria) throws Exception;
	void update(Categoria categoria) throws Exception;
	void delete(UUID id) throws Exception;
	
	List<Categoria> findAll() throws Exception;
	Categoria findById(UUID id) throws Exception;

}
