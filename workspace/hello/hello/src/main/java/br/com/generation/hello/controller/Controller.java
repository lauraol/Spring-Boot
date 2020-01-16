package br.com.generation.hello.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.generation.hello.model.Produto;
import br.com.generation.hello.model.Usuario;

//hierarquia 
//grupo = empresa
//artefado = projeto

@RestController //define que a classe será acessivel pela URL
@CrossOrigin("*") //origem que cruza limites, dois servidores rodando
//basicamente permitir que outros servidores consumam meu back end
public class Controller {
		
		Produto prod;

		@GetMapping("/hello") //o acesso a URL será feito com o método GET
		public String sayWelcome() {
			return "Bem-vindos ao meu primeiro teste usando Spring Boot.";
		}
		
		@GetMapping("/produto")
		public String mostrarProduto() {
			 Produto prod = new Produto(1, "Mochila", "Mochila escolar tamnho M, tema Harry Potter",10,10,"https://images-americanas.b2w.io/produtos/01/00/oferta/44889/2/44889207_2GG.jpg");
			 return prod.toString(); 
		}
		
		@GetMapping("/usuario")
		//criar uma variavel do tipo Usuario
		//retornar a var
		public Usuario mostrarUsuario() {
			Usuario user = new Usuario(1, "LauraOP", "lauraoliveirape@gmail.com", "Laura Oliveira Pedro", "123abc", "Administrador");	
			return user;
			
			
			
			//Usuario user = new Usuario(1, "LauraOP", "lauraoliveirape@gmail.com", "Laura Oliveira Pedro", "123abc", "Administrador");
			//return user.toString();
		}
}		
