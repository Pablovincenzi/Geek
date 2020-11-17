package br.com.geek.secao20;

import br.com.geek.secao11.Cliente;
import br.com.geek.secao11.Conta;

public class Programa53 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	Cliente cli1 = new Cliente("Pablo", "Rua 10");
	Conta c1 = new Conta(1, 200, 100, cli1);
	
	FazDeposito acao = new FazDeposito(c1);
	Thread t1 = new Thread(acao);
	Thread t2 = new Thread(acao);
	
	t1.start();
	t2.start();
	
	t1.join();
	t2.join();
	
	System.out.println(c1);
	

	}

}
