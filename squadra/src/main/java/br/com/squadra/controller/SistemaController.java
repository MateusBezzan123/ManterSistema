package br.com.squadra.controller;

import java.net.URI;
import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.squadra.dto.ListarDto;
import br.com.squadra.form.SistemaForm;
import br.com.squadra.modelo.Sistema;
import br.com.squadra.repository.Repositorio;


@RestController
@RequestMapping(value = "/sistema")
public class SistemaController {

	@Autowired
	private Repositorio repositorio;
	

	
	@RequestMapping(method=RequestMethod.GET)
    public List<ListarDto> listarSistema() {
        List<Sistema> sistemas = repositorio.findAll();
        return ListarDto.converter(sistemas);
    }
	
	
	
	@PostMapping
	@Transactional
	public ResponseEntity<ListarDto> cadastrar(@RequestBody @Valid SistemaForm form, UriComponentsBuilder uriBuilder){
		Sistema sistema = form.converter(repositorio);
		repositorio.save(sistema);
		
		URI uri = uriBuilder.path("/sistema/{id}").buildAndExpand(sistema.getId()).toUri();
		
		return ResponseEntity.created(uri).body(new ListarDto(sistema));
	}
	
}
