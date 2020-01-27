package br.org.generation.sistemaalunos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.sistemaalunos.model.Aluno;
import br.org.generation.sistemaalunos.servicos.IAlunoService;

@RestController
@CrossOrigin("*")
public class AlunoController {
	
	@Autowired
	private IAlunoService servico;
	
	//mostrar alunos
	@GetMapping("/alunos/all")
	public String mostrarAlunos() {
		
		Aluno a = new Aluno();
		a.setRa(1);
		a.setNome("Laura Oliveira Pedro");
		a.setEmail("lauraoliveira123@gmail.com");
		a.setTelefone("977842539");
		
		return a.toString();
		
	}
	
	@PostMapping("/aluno/novo")
	public ResponseEntity<Aluno> inserirNovoAluno(@RequestBody Aluno aluno){
		try {
			servico.gravarAlunoNoBanco(aluno);
			return ResponseEntity.ok(aluno);
			
		}
		catch(Exception ex) {
			return ResponseEntity.badRequest().build();
			}
	}
	
	@GetMapping("/aluno/{id}")
	public ResponseEntity<Aluno> buscarAlunoPeloId(@PathVariable int id){
		return null;
	}
	
	@PutMapping("/aluno/alterar")
	public ResponseEntity<Aluno> atualizarDados(@RequestBody Aluno aluno){
		return null;
	}

}
