package br.com.geek.secao18;

import br.com.geek.secao11.Cliente;
import br.com.geek.secao11.Conta;

public class Programa39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cli = new Cliente("Pablo", "rua teste");
		Cliente cli2 = new Cliente("Pablo", "rua teste");
		Conta c1 = new Conta(12, 1000, 2000, cli);
		Conta c2 = new Conta(12, 1000, 2000, cli2);
		
		System.out.println(c1);
		
		Caixa ca1= new Caixa();
		
		
		
		ca1.adicionar(c1);
		ca1.adicionar(c2);
		
		System.out.println(ca1.pegar(0).getSaldo());
		

	}

}
