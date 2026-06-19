package br.ifc.edu.copa;

//Goleiro HERDA de Jogador
public class Goleiro extends Jogador {
	private int defesasRealizadas;
	private int golsSofridos;

	public Goleiro(String nome, int numeroCamisa) {
// super() chama o construtor da classe "mãe" (Jogador)
		super(nome, numeroCamisa);
		this.defesasRealizadas = 0;
		this.golsSofridos = 0;
	}

	public void fazerDefesa() {
		this.defesasRealizadas++;
		System.out.println("Que defesa espetacular do goleiro " + getNome() + "!");
	}
	
	public void sofrerGol() {
		this.golsSofridos++;
		System.out.println("O goleiro " + getNome() + " sofreu um gol!");
	}
	
	public int getGolsSofridos() {
		return this.golsSofridos;
	}

	public int getDefesasRealizadas() {
		return this.defesasRealizadas;
	}
}
