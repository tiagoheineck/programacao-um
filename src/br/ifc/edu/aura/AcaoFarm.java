package br.ifc.edu.aura;

public class AcaoFarm {
	private String tipoAcao;
	private double multiplicador;

	public AcaoFarm(String tipoAcao, double multiplicador) {
		this.tipoAcao = tipoAcao;
		this.multiplicador = multiplicador;
	}

	public void executarAcao(Jogador jogador) {
		System.out.println("[AÇÃO] " + jogador.getNome() + " está tentando realizar: " + this.tipoAcao);
		if (jogador.verificarElegibilidade()) {
			double auraRecompensa = 10.0 * this.multiplicador;
			jogador.adicionarAura(auraRecompensa);
			System.out.printf("[SUCESSO] Recompensa de Atividade Concedida! +%.2f de Aura obtida.%n", auraRecompensa);
		} else {
			System.out.println("[ERRO] Ação falhou. A aura do ambiente repele jogadores abaixo do nível Six Seven.");
		}
	}
}