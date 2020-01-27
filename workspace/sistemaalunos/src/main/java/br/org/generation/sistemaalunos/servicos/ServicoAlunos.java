//Fazendo o serviço pedir para o banco

package br.org.generation.sistemaalunos.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.sistemaalunos.dao.IAlunoBD;
import br.org.generation.sistemaalunos.model.Aluno;


@Component
public class ServicoAlunos implements IAlunoService{
	
	@Autowired
	IAlunoBD repo; //repo=repositorio, uma alusão ao banco de dados
	
	
	public void gravarAlunoNoBanco(Aluno aluno) {
		try {
			repo.save(aluno);
		}
		catch(Exception ex) {
			throw new RuntimeException("Erro ao inserir novo aluno!");
		}
		
		
	}
	
	public void atualizarAlunoNoBanco(Aluno aluno) {
		try {
			repo.save(aluno);
		}
		catch(Exception ex) {
			throw new RuntimeException("Erro ao atualizar aluno no banco de dados");
		}
	}
	
	public Aluno recuperarAlunoPorId(int id) {
		return repo.findById(id).get();
		}

}
