package br.ifc.edu.copa;

import java.util.ArrayList;

public class Selecao {

	private String pais;
	private ArrayList<Jogador> jogadores;
	private Tecnico tecnico;
	
	public Selecao(String pais) {
		this.pais = pais;
		this.jogadores = new ArrayList<>();
	}
	
	public String getPais() {
		return pais;
	}
	
	public void adicionarJogador(Jogador jogador) {
		if (jogador.getNome() == "Lionel Messi") {
			System.out.println("Não é permitido adicionar o jogador " + jogador.getNome() + " à seleção " + pais + "!");
			return;
		} 
		jogadores.add(jogador);
	}
	
	public void definirTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}
	
	public void mostrarJogadores() {
		System.out.println("Seleção: " + pais);
		for (Jogador jogador : jogadores) {
			if (jogador instanceof Goleiro) {
				Goleiro goleiro = (Goleiro) jogador;
				System.out.println("- " + goleiro.getNome() + " (Gols: " + goleiro.getGolsSofridos() + ", Defesas: " + goleiro.getDefesasRealizadas() + ")");
			} else {
			System.out.println("- " + jogador.getNome() + " (Gols: " + jogador.getGolsMarcados() + ")");
			}
		}
		System.out.println("Técnico: " + tecnico.getNome() + " (Idade: " + tecnico.getIdade() + ", Habilidade: " + tecnico.getHabilidade() + ")");
	}
	
}
