package br.com.geek.secao11;

public class Cliente extends Object{
	String nome;
	String endereco;
	
	public Cliente(String nome, String endereco) {
		this.nome=nome;
		this.endereco=endereco;
		/**
		 * TESTE DE COMENTARIO
		 */
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}
	
	

}
