package br.com.phamtecnologia.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CategoriaResponseDto {
	
	@Size(min = 4, max = 100, message = "Categoria deve conter de 8 a 100 caracteres.")
	@NotBlank(message = "Nome da categoria deve ser preenchido.")
	private String nome;

}
