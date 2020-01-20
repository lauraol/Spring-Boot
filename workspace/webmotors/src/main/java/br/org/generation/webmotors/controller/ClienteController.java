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

import br.org.generation.webmotors.BDCliente;
import br.org.generation.webmotors.model.Cliente;

@RestController
public class ClienteController {
	
	// criei o meu "banco de dados"
	private BDCliente bd = new BDCliente();

	@PostMapping("/cliente/novo")
	public ResponseEntity<Cliente> novoCliente(@RequestBody Cliente cliente) {
		bd.gravar(cliente);
		return ResponseEntity.ok(cliente);

	}

	 @GetMapping("/cliente/{id}") //significa que eu posso passar qualquer valor, para usar você precisa:
	 //passar o mesmo parametro e colocar @PathVariable indicando o caminho
	 public ResponseEntity<Cliente> getCliente(@PathVariable int id){
		 Cliente cli = bd.buscar(id);
		 if(cli != null) { //encontrei um cliente com o ID especificado
			 return ResponseEntity.ok(cli);
		 }
		 else {
			 return ResponseEntity.notFound().build();
		 }
	
	 }

	@GetMapping("/cliente/todos")
	public ResponseEntity<ArrayList<Cliente>> getTodos() {
		return ResponseEntity.ok(bd.buscarTodos());

	}
	
	@PutMapping("/cliente")
	public ResponseEntity<String> alteracliente(@RequestBody Cliente cliente){
		bd.atualizar(cliente);
		return ResponseEntity.ok("Sucesso!");
		
	}
	
	@DeleteMapping
	public ResponseEntity<String> removeCliente(@PathVariable int id){
		if (bd.apagar(id)) {
			return ResponseEntity.ok("Deleted!");
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	

}
