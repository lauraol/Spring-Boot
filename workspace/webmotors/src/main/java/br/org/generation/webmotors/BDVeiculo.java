package br.org.generation.webmotors;

import br.org.generation.webmotors.model.Veiculo;
import java.util.ArrayList;

public class BDVeiculo {
	private ArrayList<Veiculo> lista;
	
	public BDVeiculo() {
		lista = new ArrayList<Veiculo>();
	}
	
	//simular meu próprio banco de dados 
	
	//CREATE
	public void inserir (Veiculo v) {
		this.lista.add(v);
		
	}
	
	//READ
	public Veiculo buscar(int id) {
		Veiculo v = null;
		
		for(Veiculo car: lista) {
			if(car.getId() == id) {
				v = car;
			}
		}
		return v;
	}
	
	//UPDATE
	public boolean atualizar(Veiculo v) {
		int posicao = -1;
		
		for(int i=0; i < lista.size(); i++) {
			if(lista.get(i).getId() == v.getId()) {
				posicao = i;
				break;
				
			}
		}
		if(posicao >= 0) {
			lista.set(posicao, v);
			return true;
		}
		return false;
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
	
	public ArrayList<Veiculo> buscarTodos(){
		return lista;
	}
	
	

}
