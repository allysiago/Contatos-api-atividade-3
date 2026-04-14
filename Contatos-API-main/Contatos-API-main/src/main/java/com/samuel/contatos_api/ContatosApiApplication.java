package com.samuel.contatos_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/contatos")
public class ContatosApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContatosApiApplication.class, args);
	}

	// GET - Buscar contatos
	@GetMapping
	public String listarContatos() {
		return "Lista de contatos retornada com sucesso!";
	}

	// POST - Criar contato
	@PostMapping
	public String criarContato() {
		return "Contato criado com sucesso!";
	}

	// PUT - Atualizar contato
	@PutMapping
	public String atualizarContato() {
		return "Contato atualizado com sucesso!";
	}

	// DELETE - Deletar contato
	@DeleteMapping
	public String deletarContato() {
		return "Contato deletado com sucesso!";
	}

}
