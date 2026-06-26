package br.ifc.edu.basico;

public class Pokemon {

	private String nome;
	private String tipo;
	private int nivel;
	private int pontosVida;
	private int pontosAtaque;
	private int pontosDefesa;
	
	public void atacar() {
		System.out.println(nome + " está atacando!");
	}
	
	public void defender() {
		System.out.println(nome + " está defendendo!");
	}
	
	public void evoluir() {
		nivel++;
		pontosVida += 10;
		pontosAtaque += 5;
		pontosDefesa += 5;
		System.out.println(nome + " evoluiu para o nível " + nivel + "!");
	}
	
	public void exibirStatus() {
		System.out.println("Nome: " + nome);
		System.out.println("Tipo: " + tipo);
		System.out.println("Nível: " + nivel);
		System.out.println("Pontos de Vida: " + pontosVida);
		System.out.println("Pontos de Ataque: " + pontosAtaque);
		System.out.println("Pontos de Defesa: " + pontosDefesa);
	}
	
}
