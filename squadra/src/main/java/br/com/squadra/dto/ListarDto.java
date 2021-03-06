package br.com.squadra.Dto;


import java.util.List;
import java.util.stream.Collectors;

import br.com.squadra.Modelo.Sistema;
import br.com.squadra.Modelo.Status;



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
	        this.sigla = sistema.getSigla();
	        this.email = sistema.getEmail();
	        this.url = sistema.getUrl();
	        this.status = sistema.getStatus();
	    }

	    public static List<ListarDto> converter(List<Sistema> sistemas){
	        return sistemas.stream().map(ListarDto::new).collect(Collectors.toList());
	    }
		

	    public int getId() {
	        return this.id;
	    }

	    public String getDescricao() {
	        return this.descricao;
	    }

	    public String getSigla() {
	        return this.sigla;
	    }

	    public String getEmail() {
	        return this.email;
	    }

	    public String getUrl() {
	        return this.url;
	    }

	    public Status getStatus() {
	        return this.status;
	    }
	    

	    

	
}
