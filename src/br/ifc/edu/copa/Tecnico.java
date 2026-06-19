package br.ifc.edu.copa;

public class Tecnico {

	private String nome;
	private int idade;
	private String habilidade; 
	
	public Tecnico(String nome, int idade, String habilidade) {
		this.nome = nome;
		this.idade = idade;
		this.habilidade = habilidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getHabilidade() {
		return habilidade;
	}
	
	
}
