package br.ifc.edu.aura;

public class Jogador {
	private String nome;
	private int nivel;
	private double auraAcumulada;
	private boolean modoFarmAtivo;

	public Jogador(String nome, int nivel) {
		this.nome = nome;
		this.nivel = nivel;
		this.auraAcumulada = 0.0;
		this.modoFarmAtivo = false;
	}

	public boolean verificarElegibilidade() {
		return this.nivel >= 67;
	}

	public void ativarFarm() {
		if (verificarElegibilidade()) {
			this.modoFarmAtivo = true;
			System.out.println("[SISTEMA] Modo Farm ATIVADO com sucesso para " + nome + "!");
		} else {
			System.out
					.println("[BLOQUEADO] Falha ao ativar: Nível 'Six Seven' (67) não atingido. Nível atual: " + nivel);
		}
	}

	public void desativarFarm() {
		this.modoFarmAtivo = false;
		System.out.println("[SISTEMA] Modo Farm DESATIVADO para " + nome + ".");
	}

	public void adicionarAura(double valor) {
		if (valor > 0) {
			this.auraAcumulada += valor;
		}
	}

// Getters e Setters para controle de estado
	public String getNome() {
		return nome;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public double getAuraAcumulada() {
		return auraAcumulada;
	}

	public boolean isModoFarmAtivo() {
		return modoFarmAtivo;
	}
}