package br.com.geek.secao21;

public class Programa57 {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		System.out.println(lista);
		lista.adicionaNoComeco("Maria");
		System.out.println(lista);
		
		lista.adicionaNoComeco("Maria2");
		System.out.println(lista);
		lista.adicionaNoComeco("Maria233");
		System.out.println(lista);
		lista.adicionaNoComeco(1);
		System.out.println(lista);
	
	
	}

}
