package br.ifc.edu.aura;

public class AuraMain {
	public static void main(String[] args) {
		System.out.println("--- INICIANDO SIMULAÇÃO DO SISTEMA DE AURA ---");
// Instanciando controlador de farm com taxa de 1.5 aura/segundo
		SistemaDeFarm sistema = new SistemaDeFarm(1.5);
		AcaoFarm mineracao = new AcaoFarm("Mineração de Cristais de Aura", 2.5);
// Cenário 1: Jogador Iniciante tentando quebrar a regra de negócio
		Jogador playerIniciante = new Jogador("GamerNovato", 45);
		playerIniciante.ativarFarm();
		sistema.processarLoopDeFarm(playerIniciante);
		mineracao.executarAcao(playerIniciante);
		System.out.println("---------------------------------------------");
// Cenário 2: Jogador que atingiu o nível estipulado ("Six Seven")
		Jogador playerAvancado = new Jogador("MestreDasAuras", 67);
		playerAvancado.ativarFarm();
// Processando farm passivo (Simulação)
		sistema.processarLoopDeFarm(playerAvancado);
// Executando ação ativa
		mineracao.executarAcao(playerAvancado);
		System.out.printf("%n[STATUS FINAL] Total de Aura de %s: %.2f%n", playerAvancado.getNome(),
				playerAvancado.getAuraAcumulada());
	}
}