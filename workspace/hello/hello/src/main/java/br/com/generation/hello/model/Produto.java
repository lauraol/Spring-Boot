package br.com.generation.hello.model;

public class Produto {
	private int id;
	private String titulo;
	private String detalhes;
	private float preco;
	private float qtdEstoque;
	private String linkFoto;
	
	public Produto(int id, String titulo, String detalhes, float preco, float qtdEstoque, String linkFoto) {
		this.id = id;
		this.titulo = titulo;
		this.detalhes = detalhes;
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
		this.linkFoto = linkFoto;
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDetalhes() {
		return detalhes;
	}
	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public float getQtdEstoque() {
		return qtdEstoque;
	}
	public void setQtdEstoque(float qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
	public String getLinkFoto() {
		return linkFoto;
	}
	public void setLinkFoto(String linkFoto) {
		this.linkFoto = linkFoto;
	}
	
	public String toString() {
		return "{\"ID do Usuário:\" \"" + this.id + "\"," + "<br>" + "\"Produto:\" \"" + this.titulo + "\","+ "<br>" + "\"Detalhes do Produto:\" \"" + this.detalhes +"\"," + "<br>" + "\"Preço:\" \"" + this.preco +"\"," + "<br>" + "\"Quantidade em Estoque:\" \"" + this.qtdEstoque +"\"," + "<br>" + "\"Foto:\" \"" + this.linkFoto + "\"}";
	}

}
