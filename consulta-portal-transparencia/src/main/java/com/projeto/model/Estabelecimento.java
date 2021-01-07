package com.projeto.model;

public class Estabelecimento {
	private String numeroInscricaoSocial;
	private String nome;
	private String razaoSocialReceita;
	private String nomeFantasiaReceita;
	private Cnae cnae;

	public Cnae getCnae() {
		return cnae;
	}

	public void setCnae(Cnae cnae) {
		this.cnae = cnae;
	}

	public String getNumeroInscricaoSocial() {
		return numeroInscricaoSocial;
	}

	public String getNome() {
		return nome;
	}

	public String getRazaoSocialReceita() {
		return razaoSocialReceita;
	}

	public String getNomeFantasiaReceita() {
		return nomeFantasiaReceita;
	}

	public void setNumeroInscricaoSocial(String numeroInscricaoSocial) {
		this.numeroInscricaoSocial = numeroInscricaoSocial;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setRazaoSocialReceita(String razaoSocialReceita) {
		this.razaoSocialReceita = razaoSocialReceita;
	}

	public void setNomeFantasiaReceita(String nomeFantasiaReceita) {
		this.nomeFantasiaReceita = nomeFantasiaReceita;
	}

}
