package br.com.geek.secao19;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Programa48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> nomes = new HashSet<String>();
		Scanner teclado = new Scanner(System.in);
		boolean res;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite os nomes");
			String nome = teclado.nextLine();
			res = nomes.add(nome);
			if(!res) {
				System.out.println("Nome não pode ser repetido");
				i--;
			}
			
		}
		
		System.out.println("no conjunto tem"+nomes.size()+"Elementos");
		for (String nome : nomes) {
			System.out.println(nome);
		}
//		nomes.add("Pablo");
//		nomes.add("Maria");
//		nomes.add("Angelina");
//		nomes.add("Maria");
//		
//		
//		System.out.println(nomes.size());
//		for (String string : nomes) {
//			System.out.println(string);
//		}
//	
	}

}
