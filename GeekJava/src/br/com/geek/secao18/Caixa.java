package br.com.geek.secao18;


import br.com.geek.secao11.Conta;

public class Caixa {
	private Object[] objetos;
	private int posicaoLivre;

	public Caixa() {
		objetos = new Conta[100];// ate 100 contas
		posicaoLivre = 0;

	}
	public void adicionar(Object nova) {
		this.objetos[this.posicaoLivre]=nova;
		this.posicaoLivre++;
	}
	
	public Object pegar(int posicao) {
		return this.objetos[posicao];
	}
}
