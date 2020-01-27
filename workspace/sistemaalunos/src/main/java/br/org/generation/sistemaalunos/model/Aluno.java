package br.org.generation.sistemaalunos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //terei uma classe que irá se tornar uma tabela/ é uma entidade persistente
@Table(name="tbl_aluno") //associando o nome da classe a tabela
public class Aluno {

@Column(name="RA")
@Id  //esse atributo é chave primaria 
@GeneratedValue(strategy = GenerationType.IDENTITY) //isso é auto_increment
private int ra;

@Column(name="nome", length = 100) //indicamos o tamanho da coluna
private String nome;

@Column(name="email", length = 100, unique = true)
private String email;

@Column(name="telefone", length = 20)
private String telefone;


public int getRa() {
	return ra;
}
public void setRa(int ra) {
	this.ra = ra;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getTelefone() {
	return telefone;
}
public void setTelefone(String telefone) {
	this.telefone = telefone;
}

public String toString() {
	return "RA: " + this.ra + "Nome: " + this.nome + "E-mail: " + this.email + "Telefone: " + this.telefone;
}

}
