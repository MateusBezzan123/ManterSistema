package br.com.squadra.modelo;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Sistema {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
    
	private String descricao;
	private String sigla;
	private String email;
	private String url;
	
	@Enumerated(EnumType.STRING)
    private Status status = Status.Ativado;
	
	public Sistema(String descricao, String sigla, String email, String url) {
		this.descricao = descricao;
		this.email = email;
		this.sigla = sigla;
		this.url = url;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
