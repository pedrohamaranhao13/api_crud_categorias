package br.com.phamtecnologia.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI costumOpenApi() {
		return new OpenAPI().components(new Components())
				.info(new Info()
						.title("API CRUD categorias")
						.description("Projeto desenvolvido com Spring Boot e Spring Data JPA")
						.version("v1"));
	}
}
