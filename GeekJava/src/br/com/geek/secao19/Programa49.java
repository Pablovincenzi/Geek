package br.com.geek.secao19;

import java.util.HashMap;
import java.util.Map;

import br.com.geek.secao11.Cliente;
import br.com.geek.secao11.Conta;

public class Programa49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Conta> contas = new HashMap<String, Conta>();
		Cliente cl1 = new Cliente("Pablo", "Rua duque de caxias");
		Cliente cl2 = new Cliente("Pablo2", "Rua duque de caxias2");

		Conta c1 = new Conta(1, 200, 1000, cl1);
		Conta c2 = new Conta(2, 200, 300, cl2);

		contas.put("Pessoa Fisica", c1);
		contas.put("Pessoa Juridica", c2);
		System.out.println(contas.size());
		System.out.println(contas.get("Pessoa Fisica"));

	}

}
