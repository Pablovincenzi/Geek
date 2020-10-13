package br.com.geek.secao18;


import br.com.geek.secao11.Conta;

public class Caixa {
	private Conta[] contas;
	private int posicaoLivre;

	public Caixa() {
		contas = new Conta[100];// ate 100 contas
		posicaoLivre = 0;

	}
	public void adicionar(Conta nova) {
		this.contas[this.posicaoLivre]=nova;
		this.posicaoLivre++;
	}
	
	public Conta pegar(int posicao) {
		return this.contas[posicao];
	}
}
