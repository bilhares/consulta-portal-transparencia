package com.projeto.model;

public class OrgaoVinculado {
	private String cnpj;
	private String codigoSIAFI;
	private String descricaoPoder;
	private String nome;
	private OrgaoMaximo orgaoMaximo;

	public String getCnpj() {
		return cnpj;
	}

	public String getCodigoSIAFI() {
		return codigoSIAFI;
	}

	public String getDescricaoPoder() {
		return descricaoPoder;
	}

	public String getNome() {
		return nome;
	}

	public OrgaoMaximo getOrgaoMaximo() {
		return orgaoMaximo;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setCodigoSIAFI(String codigoSIAFI) {
		this.codigoSIAFI = codigoSIAFI;
	}

	public void setDescricaoPoder(String descricaoPoder) {
		this.descricaoPoder = descricaoPoder;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setOrgaoMaximo(OrgaoMaximo orgaoMaximo) {
		this.orgaoMaximo = orgaoMaximo;
	}

}
