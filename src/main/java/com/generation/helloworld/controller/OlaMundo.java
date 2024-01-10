package com.generation.helloworld.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello-world")
public class OlaMundo {

	@GetMapping
	public String olaMundo() {
		return "Olá Mundo!!!";
	}
		
	@GetMapping("/listaBsm")
	public  List<String> listaBSM() {
		return Arrays.asList(
				"Responsabilidade Pessoal",
				"Mentalidade de Crescimento",
				"Orientação ao Futuro",
				"Persistência",
				"Comunicação",
				"Atenção para Detalhes",
				"Trabalho em Equipe",
				"Proatividade"
				);
	}
	
	@GetMapping("/listaObjetivos")
	public List<String> listaObjetivos() {
		return Arrays.asList(
                "Aprender mais sobre Spring Boot",
                "Melhorar habilidades em programação",
                "Explorar novas tecnologias"
                );
	}
	
	
	
	
	
	
	
	
	
	
}
