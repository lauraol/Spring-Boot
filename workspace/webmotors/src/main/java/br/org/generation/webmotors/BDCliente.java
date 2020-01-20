package br.org.generation.webmotors;

import br.org.generation.webmotors.model.Cliente;
import java.util.ArrayList;

public class BDCliente {
	private ArrayList<Cliente> lista;
	
	public BDCliente() {
		lista = new ArrayList<Cliente>();
	}

	//simulando um banco de dados
	
	//CREATE
	public void gravar(Cliente cli) {
		this.lista.add(cli);
		
	}
	
	
	//READ
	//percorrer o vetor para comparar o Id
	public Cliente buscar(int id) {
		Cliente c = null;
		for(Cliente cli: lista) { //para cada var do tipo cli presente na minha lista
			if(cli.getId() == id) {
				c = cli;
				break;
			}
		}
		return c;
		
	}
	
	
	//DELETE
	public boolean apagar(int id) {
		
		//criar um looping
		//encontrar a posição
		int posicao = -1;
		for(int i=0; i < lista.size(); i++) {
			if(lista.get(i).getId() == id) {
				posicao = i;
				break;
			}
		}
		
		//apagar
		if(posicao >= 0) {
			lista.remove(posicao);
			return true;
		}
		return false;
		
	}
	
	
	//UPDATE
	public boolean atualizar(Cliente cli) {
		int posicao = -1;
		
		for(int i=0; i < lista.size(); i++) {
			if(lista.get(i).getId() == cli.getId()) {
				posicao = i;
				break;
			}
		}
	
		if(posicao >= 0) {
			lista.set(posicao, cli);
			return true;
		}
		return false;
		
		
	}
	
	
	public ArrayList<Cliente> buscarTodos(){
		return lista;
	}

}
