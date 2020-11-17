package br.com.geek.secao21;

public class Programa56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vetor lista = new Vetor();
		for (int i = 0; i < 200; i++) { //dobramos o tamanho da lista
			Aluno a = new Aluno("Maria"+i);
			
			lista.adiciona(a);
			
		}
		System.out.println(lista);
		System.out.print(lista.tamanho());

	}

}
