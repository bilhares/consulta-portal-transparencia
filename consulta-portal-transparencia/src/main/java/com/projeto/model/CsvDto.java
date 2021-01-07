package com.projeto.model;

public class CsvDto {

	private String dataTransacao;
	private String valorTransacao;
	private String razaoSocialReceitaEstabelecimento;
	private String numeroInscricaoSocialEstabelecimento;
	private String cnaeClasse;
	private String cnaeDivisao;
	private String cnaeGrupo;
	private String cnaeSubclasse;
	private String orgaoMaximoCodigo;
	private String orgaoMaximoNome;
	private String orgaoMaximoSigla;

	public CsvDto(String dataTransacao, String valorTransacao, String razaoSocialReceitaEstabelecimento,
			String numeroInscricaoSocialEstabelecimento, String cnaeClasse, String cnaeDivisao, String cnaeGrupo,
			String cnaeSubclasse, String orgaoMaximoCodigo, String orgaoMaximoNome, String orgaoMaximoSigla) {
		super();
		this.dataTransacao = dataTransacao;
		this.valorTransacao = valorTransacao;
		this.razaoSocialReceitaEstabelecimento = razaoSocialReceitaEstabelecimento;
		this.numeroInscricaoSocialEstabelecimento = numeroInscricaoSocialEstabelecimento;
		this.cnaeClasse = cnaeClasse;
		this.cnaeDivisao = cnaeDivisao;
		this.cnaeGrupo = cnaeGrupo;
		this.cnaeSubclasse = cnaeSubclasse;
		this.orgaoMaximoCodigo = orgaoMaximoCodigo;
		this.orgaoMaximoNome = orgaoMaximoNome;
		this.orgaoMaximoSigla = orgaoMaximoSigla;
	}

	public CsvDto() {
	}

	public String getDataTransacao() {
		return dataTransacao;
	}

	public String getValorTransacao() {
		return valorTransacao;
	}

	public String getRazaoSocialReceitaEstabelecimento() {
		return razaoSocialReceitaEstabelecimento;
	}

	public String getNumeroInscricaoSocialEstabelecimento() {
		return numeroInscricaoSocialEstabelecimento;
	}

	public String getCnaeClasse() {
		return cnaeClasse;
	}

	public String getCnaeDivisao() {
		return cnaeDivisao;
	}

	public String getCnaeGrupo() {
		return cnaeGrupo;
	}

	public String getCnaeSubclasse() {
		return cnaeSubclasse;
	}

	public String getOrgaoMaximoCodigo() {
		return orgaoMaximoCodigo;
	}

	public String getOrgaoMaximoNome() {
		return orgaoMaximoNome;
	}

	public String getOrgaoMaximoSigla() {
		return orgaoMaximoSigla;
	}

	public void setDataTransacao(String dataTransacao) {
		this.dataTransacao = dataTransacao;
	}

	public void setValorTransacao(String valorTransacao) {
		this.valorTransacao = valorTransacao;
	}

	public void setRazaoSocialReceitaEstabelecimento(String razaoSocialReceitaEstabelecimento) {
		this.razaoSocialReceitaEstabelecimento = razaoSocialReceitaEstabelecimento;
	}

	public void setNumeroInscricaoSocialEstabelecimento(String numeroInscricaoSocialEstabelecimento) {
		this.numeroInscricaoSocialEstabelecimento = numeroInscricaoSocialEstabelecimento;
	}

	public void setCnaeClasse(String cnaeClasse) {
		this.cnaeClasse = cnaeClasse;
	}

	public void setCnaeDivisao(String cnaeDivisao) {
		this.cnaeDivisao = cnaeDivisao;
	}

	public void setCnaeGrupo(String cnaeGrupo) {
		this.cnaeGrupo = cnaeGrupo;
	}

	public void setCnaeSubclasse(String cnaeSubclasse) {
		this.cnaeSubclasse = cnaeSubclasse;
	}

	public void setOrgaoMaximoCodigo(String orgaoMaximoCodigo) {
		this.orgaoMaximoCodigo = orgaoMaximoCodigo;
	}

	public void setOrgaoMaximoNome(String orgaoMaximoNome) {
		this.orgaoMaximoNome = orgaoMaximoNome;
	}

	public void setOrgaoMaximoSigla(String orgaoMaximoSigla) {
		this.orgaoMaximoSigla = orgaoMaximoSigla;
	}

}
