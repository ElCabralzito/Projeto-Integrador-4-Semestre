package br.edu.senacsp.projeto.resources;
import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.edu.senacsp.projeto.entities.Carro;
import br.edu.senacsp.projeto.services.ConcessionariaService;

@RestController
@RequestMapping(value = "/concessionaria")
public class ConcessionariaResource {
	@Autowired
	private ConcessionariaService concessionariaService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Carro> findById(@PathVariable Integer id){
		Carro carro = concessionariaService.findById(id);
		return ResponseEntity.ok().body(carro);
	}	

	@GetMapping(value ="/disponiveis")
	public ResponseEntity<List<Carro>> ListarDisponiveis(){
		List<Carro> carros = 
				concessionariaService.listarTodosDisponiveis();
		return ResponseEntity.ok().body(carros);
	}

	@GetMapping(value ="/indisponiveis")
	public ResponseEntity<List<Carro>> listarIndisponiveis(){
		List<Carro> carros = 
				concessionariaService.listarTodosIndisponiveis();
		return ResponseEntity.ok().body(carros);
	}

	@GetMapping
	public ResponseEntity<List<Carro>> findAll(){
		List<Carro> carros = concessionariaService.findAll();
		return ResponseEntity.ok().body(carros);
	}

	@GetMapping(value = "/modelo/{modelo}")
	public ResponseEntity<Carro> findByNome(@PathVariable String modelo){
		Carro carro = concessionariaService.findByModelo(modelo);
		return ResponseEntity.ok().body(carro);
	}
	
	@PostMapping
	public ResponseEntity<Carro> gravarCarro(
	@RequestBody Carro carro){
		carro = concessionariaService.gravarCarro(carro);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").
		buildAndExpand(carro.getId()).toUri();
		return ResponseEntity.created(uri).body(carro);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Integer id){
		concessionariaService.deletar(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Carro> update(@PathVariable Integer id, 
			@RequestBody Carro carro){
		Carro alterado = concessionariaService.update(id, carro);
		return ResponseEntity.ok().body(alterado);
	}

}
