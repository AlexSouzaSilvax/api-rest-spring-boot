package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.model.Carros;

@RestController
public class CarrosController {

	@RequestMapping("/carros")	
	public List<Carros> listaCarros() {		

	    Carros c = new Carros("0", "https://scontent-ort2-1.cdninstagram.com/vp/ffaf9e20d9e62b08a6bccb3cd0aed3c6/5E098503/t51.2885-15/e35/67886062_496588337772960_8760688499312704207_n.jpg?_nc_ht=scontent-ort2-1.cdninstagram.com", "Fiat Idea Attractive", "Prata", "2014", "Fiat", "28.000");
	    Carros c0 = new Carros("1", "http://www.carrosdub.com.br/wp-content/uploads/2016/05/polo-rebaixado-aro18-01-5.jpg", "VW Polo 1.6 Hatch", "Vermelha", "2003", "Volkswagens", "18.800");
		Carros c1 = new Carros("2", "https://i.pinimg.com/originals/de/5e/e8/de5ee8d1de7bfd41e087a83995850776.jpg", "Corolla fixa", "Prata", "2019", "Toyota", "48.900");
		Carros c2 = new Carros("3", "https://s2.glbimg.com/EKy5hlv4OtZgJDODUvfTdT_mhN8=/620x413/e.glbimg.com/og/ed/f/original/2018/04/24/chevrolet-s10-2019-14.jpg", "Chevrolet S10", "Preta", "2019", "Chevrolet", "108.100");
		Carros c3 = new Carros("4", "https://img2.icarros.com/dbimg/imgadicionalnoticia/4/103518_1", "Fiat Toro", "Vermelha", "2019", "Fiat", "89.200" );
		Carros c4 = new Carros("5", "https://revistacarro.com.br/wp-content/uploads/2018/05/ford_new_fiesta_sel_at.jpg", "Ford Fiesta Black", "Preto", "2019", "Ford", "52.000");
		Carros c5 = new Carros("6", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQqaT485R9DTJDWyer_Myf5gefxnQbLRoMvlXS7kXDV17LsdepsKg", "Corolla Polícia", "", "2019", "Toyota", "Free");	
	
		return Arrays.asList(c, c0,c1,c2,c3,c4,c5);
	}
}
