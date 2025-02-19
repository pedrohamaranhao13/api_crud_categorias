package br.com.phamtecnologia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.phamtecnologia.domian.entities.Categoria;
import br.com.phamtecnologia.domian.interfaces.CategoriaService;

@RestController
@RequestMapping(value = "/api/categorias")
public class CategoriasController {
	
	@Autowired
	CategoriaService categoriaService;
	
	@PostMapping
	public void post() {
		// TODO
	}
	
	@PutMapping
	public void put() {
		// TODO
	}
	
	@DeleteMapping
	public void delete() {
		// TODO
	}
	
	@GetMapping
	public List<Categoria> getAll() {
		try {
			return categoriaService.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
