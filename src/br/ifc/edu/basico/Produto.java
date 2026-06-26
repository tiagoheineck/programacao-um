package br.ifc.edu.basico;

import java.util.Date;

public class Produto {

	private int codigo;
	private String nome;
	private String descricao;
	private double preco_compra;
	private double preco_venda;
	private int quantidade_estoque;
	private boolean ativo;
	private Date data_cadastro;
	
	public void inserir(int codigo, String nome, String descricao, double preco_compra, double preco_venda, int quantidade_estoque, boolean ativo, Date data_cadastro) {
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.preco_compra = preco_compra;
		this.preco_venda = preco_venda;
		this.quantidade_estoque = quantidade_estoque;
		this.ativo = ativo;
		this.data_cadastro = data_cadastro;
	}
	
	public void alterar(int codigo, String nome, String descricao, double preco_compra, double preco_venda, int quantidade_estoque, boolean ativo, Date data_cadastro) {
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.preco_compra = preco_compra;
		this.preco_venda = preco_venda;
		this.quantidade_estoque = quantidade_estoque;
		this.ativo = ativo;
		this.data_cadastro = data_cadastro;
	}
	
	public void excluir() {
		this.ativo = false;
	}
	
	public void pesquisar() {
		System.out.println("Código: " + codigo);
		System.out.println("Nome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Preço de Compra: " + preco_compra);
		System.out.println("Preço de Venda: " + preco_venda);
		System.out.println("Quantidade em Estoque: " + quantidade_estoque);
		System.out.println("Ativo: " + ativo);
		System.out.println("Data de Cadastro: " + data_cadastro);
	}
	
	
}
