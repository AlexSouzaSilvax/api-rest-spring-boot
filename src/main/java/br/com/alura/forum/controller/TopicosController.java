package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.model.Curso;
import br.com.alura.forum.model.Topico;

import br.com.alura.forum.model.Carros;

@RestController
public class TopicosController {
	
	@RequestMapping("/topicos")	
	public List<Topico> listaTopicos() {		
		Topico topico = new Topico("Duvida", "Duvida com Spring", new Curso("Spring", "Programação"));
		Topico topico2 = new Topico("Problema", "Não sei o que fazer da via", new Curso("A", "Programação"));
		Topico topico3 = new Topico("Error", "Error: 'NullPointerException'", new Curso("B", "Programação"));
		return Arrays.asList(topico, topico2, topico3);
	}
}
