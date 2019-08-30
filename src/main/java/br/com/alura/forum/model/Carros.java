package br.com.alura.forum.model;

public class Carros {
	
	private String id;
	private String img;
	private String nome;
	private String cor;
	private String ano;
	private String fabricante;
	private String valor;
	
	public Carros(String id,String img, String nome, String cor, String ano, String fabricante, String valor) {
		this.id = id;
		this.img = img;
		this.nome = nome;
		this.cor = cor;
		this.ano = ano;
		this.fabricante = fabricante;
		this.valor = valor;
		
	}

	public String getId() {
		return id;
	}

	public String getImg() {
		return img;
	}

	public String getNome() {
		return nome;
	}

	public String getCor() {
		return cor;
	}

	public String getAno() {
		return ano;
	}

	public String getFabricante() {
		return fabricante;
	}

	public String getValor() {
		return valor;
	}
	
	
	
	
}
