package br.org.generation.webmotors.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.webmotors.BDVeiculo;
import br.org.generation.webmotors.model.Veiculo;

@RestController 
public class VeiculoController {
	private BDVeiculo bd = new BDVeiculo();
	
	
	//cadastrar um novo veiculo
	@PostMapping("/veiculo/novo")
	public ResponseEntity<Veiculo> novoVeiculo(@RequestBody Veiculo v){
	
		bd.inserir(v);
		return ResponseEntity.ok(v);
	}
	
	
	//buscar veiculo pelo ID
	@GetMapping("/veiculo/{id}")
	public ResponseEntity<Veiculo> getVeiculo(@PathVariable int id){
		Veiculo v = bd.buscar(id);
		if(v != null) {
			return ResponseEntity.ok(v);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	//buscar TODA a lista de veiculos
	@GetMapping("/veiculo/todos")
	public ResponseEntity<ArrayList<Veiculo>> getTodos(){
		return ResponseEntity.ok(bd.buscarTodos());
	}
	
	//alterar dados dos veiculos cadastrados no banco de dados 
	@PutMapping("/veiculo")
	public ResponseEntity<String> alterarveiculo(@RequestBody Veiculo v){
		bd.atualizar(v);
		return ResponseEntity.ok("Sucesso ao alterar dados!");
		
	}
	
	//detetar veiculo cadastrado no banco de dados 
	@DeleteMapping("/veiculo/{id}")
	public ResponseEntity<String> removeveiculo(@PathVariable int id){
		if(bd.apagar(id)) {
			return ResponseEntity.ok("Apagado!");
			
		}
		else {
			return ResponseEntity.notFound().build();					}
	}
	
	

}
