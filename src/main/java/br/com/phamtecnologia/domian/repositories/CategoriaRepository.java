package br.com.phamtecnologia.domian.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.phamtecnologia.domian.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, UUID>{

}
