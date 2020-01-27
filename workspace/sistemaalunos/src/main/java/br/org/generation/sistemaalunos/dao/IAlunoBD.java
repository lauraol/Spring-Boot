//INTEGRAÇÃO COM O O BANCO DE DADOS	

package br.org.generation.sistemaalunos.dao;

import org.springframework.data.repository.CrudRepository;

import br.org.generation.sistemaalunos.model.Aluno;

public interface IAlunoBD extends CrudRepository<Aluno, Integer>{

}
