package br.com.squadra.Dto;

import java.time.LocalDateTime;

import br.com.squadra.Modelo.Sistema;
import br.com.squadra.Repository.Repositorio;






public class AtualizarDto {
	private String url;

    private String justificativa;

    private LocalDateTime dataModificacao = LocalDateTime.now();

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getJustificativa() {
        return this.justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public LocalDateTime getDataModificacao() {
        return this.dataModificacao;
    }

    public void setDataModificacao(LocalDateTime dataModificacao) {
        this.dataModificacao = dataModificacao;
    }

    public Sistema atualizar(int id, Repositorio repo) {
        Sistema sistema = repo.getOne(id);
        sistema.setUrl(this.url);
        sistema.setJustificativa(this.justificativa);
        sistema.setData(this.dataModificacao);
        return sistema;
    }
}
