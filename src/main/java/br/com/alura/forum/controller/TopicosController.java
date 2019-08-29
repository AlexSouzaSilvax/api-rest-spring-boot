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
	
	@RequestMapping("/carros")	
	public List<Carros> listaCarros() {		
		
	    Carros c = new Carros("0", "Fiat Idea Attractive", "Fiat", "2014", "https://pbs.twimg.com/media/DGqBkDzXUAAwLaL?format=jpg&name=small");
	    Carros c0 = new Carros("1", "VW Polo 1.6 Hatch", "Volkswagens", "2003", "https://pbs.twimg.com/media/EBFImrEWwAIKl0r?format=png&name=small");
		Carros c1 = new Carros("2", "Corolla fixa", "Toyota", "2019", "https://i.pinimg.com/originals/de/5e/e8/de5ee8d1de7bfd41e087a83995850776.jpg");
		Carros c2 = new Carros("3", "Chevrolet S10", "Chevrolet", "2019", "https://s2.glbimg.com/EKy5hlv4OtZgJDODUvfTdT_mhN8=/620x413/e.glbimg.com/og/ed/f/original/2018/04/24/chevrolet-s10-2019-14.jpg");
		Carros c3 = new Carros("4", "Fiat Toro", "Fiat", "2019", "https://img2.icarros.com/dbimg/imgadicionalnoticia/4/103518_1");
		Carros c4 = new Carros("5", "Ford Fiesta Black", "Ford", "2019", "https://revistacarro.com.br/wp-content/uploads/2018/05/ford_new_fiesta_sel_at.jpg");
		Carros c5 = new Carros("6", "Corolla Polícia", "Toyota", "2019", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQqaT485R9DTJDWyer_Myf5gefxnQbLRoMvlXS7kXDV17LsdepsKg");	
	
		return Arrays.asList(c, c0,c1,c2,c3,c4,c5);
	}
}
