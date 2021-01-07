package com.projeto.model;

public class Cartoes {

	private String dataTransacao;
	private String valorTransacao;
	private Estabelecimento estabelecimento;
	private UnidadeGestora unidadeGestora;

	public String getDataTransacao() {
		return dataTransacao;
	}

	public String getValorTransacao() {
		return valorTransacao;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public void setDataTransacao(String dataTransacao) {
		this.dataTransacao = dataTransacao;
	}

	public void setValorTransacao(String valorTransacao) {
		this.valorTransacao = valorTransacao;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public UnidadeGestora getUnidadeGestora() {
		return unidadeGestora;
	}

	public void setUnidadeGestora(UnidadeGestora unidadeGestora) {
		this.unidadeGestora = unidadeGestora;
	}

}
