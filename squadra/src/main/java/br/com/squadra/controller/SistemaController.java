package br.com.squadra.controller;

import java.net.URI;
import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.squadra.dto.ListarDto;
import br.com.squadra.form.SistemaForm;
import br.com.squadra.modelo.Sistema;
import br.com.squadra.repository.Repositorio;


@RestController
@RequestMapping("/sistema")
public class SistemaController {

	@Autowired
	private Repositorio repositorio;
	

	@GetMapping
	public List<ListarDto> listar(){
		List<Sistema> sistema = repositorio.findAll();
		return 	ListarDto.converter(sistema);
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
