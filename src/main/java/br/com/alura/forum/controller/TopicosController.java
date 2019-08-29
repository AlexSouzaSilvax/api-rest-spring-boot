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
		
	    Carros c = new Carros("0", "VW Polo 1.6 Hatch", "Volkswagens", "2003", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT9jKwazFmcF9XBAuuZnUlqsQCz0W97ELwrQC9GHqoiBBQz2TtK");
		Carros c1 = new Carros("1", "Corola1", "-", "2019", "https://i.pinimg.com/originals/de/5e/e8/de5ee8d1de7bfd41e087a83995850776.jpg");
		Carros c2 = new Carros("2", "Corola2", "-", "2019", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT1xvgkmG-HTgdPoSofDxDRYOFC6Pm6ooTBWgA1Mlw7T-zmEV37");
		Carros c3 = new Carros("3", "Corola3", "-", "2019", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSthZ-OMPSlHsXfoUhXVqCTnbq-Alne4T4Rq1x6xyyWLSbmcLxT");
		Carros c4 = new Carros("4", "Corola4", "-", "2019", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSMvYD_GK-qK_veTcSiMAWZk44_nDW9lYvMbRBrEMeF98i_ZOsK");
		Carros c5 = new Carros("5", "Corola5", "-", "2019", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQqaT485R9DTJDWyer_Myf5gefxnQbLRoMvlXS7kXDV17LsdepsKg");	
		
		return Arrays.asList(c,c1,c2,c3,c4,c5);
	}
}
