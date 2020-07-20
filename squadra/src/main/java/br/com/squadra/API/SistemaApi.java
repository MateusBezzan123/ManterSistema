package br.com.squadra.API;

import java.net.URI;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.squadra.Dto.AtualizarDto;
import br.com.squadra.Dto.CadastrarDto;
import br.com.squadra.Dto.DetalheDto;
import br.com.squadra.Dto.ListarDto;
import br.com.squadra.Modelo.Sistema;
import br.com.squadra.Repository.Repositorio;





@RestController
@RequestMapping("/sistema")
public class SistemaApi {

	@Autowired
    private Repositorio repositorio;

    @CrossOrigin
    @GetMapping
    public List<ListarDto> listarSistema() {
        List<Sistema> sistemas = repositorio.findAll();
        return ListarDto.converter(sistemas);
    }

   
    @CrossOrigin
    @GetMapping("/{id}")
    public DetalheDto detalhar(@PathVariable int id) {
        Sistema sistema = repositorio.getOne(id);
        return new DetalheDto(sistema);
    }

    @CrossOrigin
    @PostMapping
    @Transactional
    public ResponseEntity<ListarDto> cadastrarSistema(@RequestBody CadastrarDto dto, UriComponentsBuilder uriBuilder) {
        Sistema sistema = dto.cadastro();         
        repositorio.save(sistema);
        URI uri = uriBuilder.path("/sistema/{id}").buildAndExpand(sistema.getId()).toUri(); 
        return ResponseEntity.created(uri).body(new ListarDto(sistema));
    }
    
    @CrossOrigin
    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<DetalheDto> alterarSistema(@PathVariable int id, @RequestBody AtualizarDto dto) {
        Sistema sistema = dto.atualizar(id, repositorio);
        repositorio.save(sistema);
        return ResponseEntity.ok(new DetalheDto(sistema));
    }
  
}
