package br.ifc.edu.basico;

public class Automovel {

	private String numeroPlaca;
	private String cor;
	private int ano;
	private String tipoCombustivel;
	private int numeroPortas;
	private double quilometragem;
	private String renavam;
	private String numeroChassi;
	private float valorLocacao;
	
	public void cadastrarAutomovel(String numeroPlaca, String cor, int ano, String tipoCombustivel, int numeroPortas,
			double quilometragem, String renavam, String numeroChassi, float valorLocacao) {
		this.numeroPlaca = numeroPlaca;
		this.cor = cor;
		this.ano = ano;
		this.tipoCombustivel = tipoCombustivel;
		this.numeroPortas = numeroPortas;
		this.quilometragem = quilometragem;
		this.renavam = renavam;
		this.numeroChassi = numeroChassi;
		this.valorLocacao = valorLocacao;
	}
	
	public void editarAutomovel(String numeroPlaca, String cor, int ano, String tipoCombustivel, int numeroPortas,
			double quilometragem, String renavam, String numeroChassi, float valorLocacao) {
		this.numeroPlaca = numeroPlaca;
		this.cor = cor;
		this.ano = ano;
		this.tipoCombustivel = tipoCombustivel;
		this.numeroPortas = numeroPortas;
		this.quilometragem = quilometragem;
		this.renavam = renavam;
		this.numeroChassi = numeroChassi;
		this.valorLocacao = valorLocacao;
	}
	
	public void removerAutomovel() {
		this.numeroPlaca = null;
		this.cor = null;
		this.ano = 0;
		this.tipoCombustivel = null;
		this.numeroPortas = 0;
		this.quilometragem = 0.0;
		this.renavam = null;
		this.numeroChassi = null;
		this.valorLocacao = 0.0f;
	}
	
}
