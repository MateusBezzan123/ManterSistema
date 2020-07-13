package br.com.squadra.dto;

import br.com.squadra.modelo.Sistema;

public class CadastrarDto {

	private String descricao;
	private String sigla;
	private String email;
	private String url;
	
	public Sistema cadastro() {
		return new Sistema(descricao,sigla,email,url);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
