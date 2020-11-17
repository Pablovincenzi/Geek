package br.com.geek.secao20;

import br.com.geek.secao11.Conta;

public class FazDeposito implements Runnable {
	public Conta conta;
	
	public FazDeposito(Conta conta) {
		this.conta=conta;
		
	}

	@Override
	public void run() {
		this.conta.depositar(100.0f);
		
	}
	

}
