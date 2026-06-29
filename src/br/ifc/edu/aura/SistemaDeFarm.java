package br.ifc.edu.aura;

public class SistemaDeFarm {
	private double taxaBaseFarm;
	private final int NIVEL_REQUISITO = 67;

	public SistemaDeFarm(double taxaBaseFarm) {
		this.taxaBaseFarm = taxaBaseFarm;
	}

	public double calcularAura(Jogador jogador, int tempoSegundos) {
		if (!jogador.verificarElegibilidade() || !jogador.isModoFarmAtivo()) {
			return 0.0;
		}
		return tempoSegundos * this.taxaBaseFarm;
	}

	public void processarLoopDeFarm(Jogador jogador) {
		if (jogador.isModoFarmAtivo() && jogador.verificarElegibilidade()) {
// Simulação de um ciclo de farm de 5 segundos
			double auraGanhas = calcularAura(jogador, 5);
			jogador.adicionarAura(auraGanhas);
			System.out.printf("[FARM PASSIVO] %s farmou %.2f unidades de Aura (Total: %.2f)%n A vida é legal %s", 
					jogador.getNome(), auraGanhas, jogador.getAuraAcumulada(), "Judas");
		} else {
			System.out.println("[ALERTA] Processamento abortado: Jogador inelegível ou com farm desligado.");
		}
	}
}