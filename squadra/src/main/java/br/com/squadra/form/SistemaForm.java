package br.com.squadra.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.squadra.modelo.Sistema;
import br.com.squadra.repository.Repositorio;

public class SistemaForm {

    @NotNull @NotEmpty @Size(max=100)
	private String descricao;
    
    @NotNull @NotEmpty @Size(max=10)
    private String sigla;
	
    @Email @Size(max=100)
    private String email;
    
    @Size(max=50)
	private String url;

	public String getDescricao() {
		return descricao;
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

	public Sistema converter(Repositorio repositorio) {
		return new Sistema(descricao, sigla, email, url);
	}
}
