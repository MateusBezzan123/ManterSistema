package br.com.squadra.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.squadra.modelo.Sistema;

public interface Repositorio extends JpaRepository<Sistema, Integer> {

	List<Sistema> findByDescricao(String descricao);
}
