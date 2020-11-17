package br.com.geek.secao19;

import java.util.ArrayList;
import br.com.geek.secao11.Cliente;
import java.util.Collections;

import br.com.geek.secao11.Cliente;

public class Programa46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(107);
		numeros.add(55);

//		System.out.println(nomes.get(0));
//		for (int i = 0; i < nomes.size(); i++) {
//			System.out.println(nomes.get(i));
//			
//	
//		}
		Collections.sort(numeros);

		for (Object nome : numeros) {
			System.out.println(nome);

		}
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();

		Cliente cli1 = new Cliente("Pablo", "Rua 01");
		Cliente cli2 = new Cliente("Pablo2", "Rua 02");

		clientes.add(cli1);
		clientes.add(cli2);
		for (Cliente cliente : clientes) {
			System.out.println(cliente);

		}

	}

}
