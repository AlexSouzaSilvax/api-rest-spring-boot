package br.com.alura.forum.model;

public class Carros {
	
	private String id;
	private String nome;
	private String marca;
	private String ano;
	private String img;
	
	public Carros(String id,String nome, String marca, String ano, String img) {
		this.id = id;
		this.nome = nome;
		this.marca = marca;
		this.ano = ano;
		this.img = img;
	}
	
	public String getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getMarca() {
		return marca;
	}
	public String getAno() {
		return ano;
	}
	public String getImg() {
		return img;
	}
	
	
}
