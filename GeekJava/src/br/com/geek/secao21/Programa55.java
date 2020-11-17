package br.com.geek.secao21;

public class Programa55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno a1 = new Aluno("Pablo");
		Aluno a2 = new Aluno("Pablo02");
		
		Vetor lista = new Vetor();
		lista.adiciona(a1);
		lista.adiciona(a2);
        System.out.println(lista);
		System.out.println("Total "+lista.tamanho());
		
//		try {
//			System.out.println(lista.pega(101));
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
		Aluno a3 = new Aluno("Maria");
		lista.adiciona(1, a3);
		System.out.println(a3);
		System.out.println(lista);
		lista.remove(0);
		System.out.println(lista);
		
	
	}
	

}
