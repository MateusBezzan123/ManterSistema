package br.com.squadra.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.squadra.Modelo.Sistema;



public interface Repositorio extends JpaRepository<Sistema, Integer> {
    
    List<Sistema> findByDescricao(String descricao);
}
