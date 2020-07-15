package br.com.squadra.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.squadra.modelo.Sistema;
import br.com.squadra.modelo.Status;

public class ListarDto {

	private int id;
	private String descricao;
	private String sigla;
	private String email;
	private String url;
	private Status status;
	
	public ListarDto(Sistema sistema) {
		this.id = sistema.getId();
		this.descricao = sistema.getDescricao();
		this.email = sistema.getEmail();
		this.sigla = sistema.getSigla();
		this.url = sistema.getUrl();
		this.status = sistema.getStatus();
	}

	public static List<ListarDto> converter(List<Sistema> sistemas) {
		return sistemas.stream().map(ListarDto::new).collect(Collectors.toList());
	}
	
	public int getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public Status getStatus() {
		return status;
	}

	public String getSigla() {
		return sigla;
	}

	public String getEmail() {
		return email;
	}

	public String getUrl() {
		return url;
	}

	
}
