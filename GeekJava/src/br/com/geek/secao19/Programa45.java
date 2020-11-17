package br.com.geek.secao19;

import java.util.ArrayList;
import java.util.Collections;

public class Programa45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList nomes = new ArrayList();
		nomes.add("Pablo");
		nomes.add("Pab");
		nomes.add("Pablo2");
		
		
//		System.out.println(nomes.get(0));
//		for (int i = 0; i < nomes.size(); i++) {
//			System.out.println(nomes.get(i));
//			
//	
//		}
		Collections.sort(nomes);
		
		for (Object nome : nomes) {
			System.out.println(nome);
		}
	}

}
