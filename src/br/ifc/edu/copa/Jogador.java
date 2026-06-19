package br.ifc.edu.copa;


public class Jogador {
	// Atributos privados (ninguém acessa direto com o ".")
	private String nome;
	private int numeroCamisa;
	private int golsMarcados;

	// Construtor (Ajuda a criar o objeto já com dados iniciais)
	public Jogador(String nome, int numeroCamisa) {
		this.nome = nome;
		this.numeroCamisa = numeroCamisa;
		this.golsMarcados = 0; // Começa a copa com zero gols
	}

	// Método Getter (Para ler o nome)
	public String getNome() {
		return this.nome;
	}

	// Método Getter (Para ler os gols)
	public int getGolsMarcados() {
		return this.golsMarcados;
	}

	// Método Setter (Regra de proteção: camisa deve ser válida)
	public void setNumeroCamisa(int novoNumero) {
		if (novoNumero > 0 && novoNumero <= 26) { // Limite de inscrição da FIFA
			this.numeroCamisa = novoNumero;
		} else {
			System.out.println("Número de camisa inválido para a Copa!");
		}
	}

	public void marcarGol() {
		this.golsMarcados++;
	}
}
