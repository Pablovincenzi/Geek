package teste;

import java.util.Scanner;

public class Programa9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade;
		String nome;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe nome");
		nome = teclado.nextLine();
		System.out.println("Informe idade");
		idade = Integer.parseInt(teclado.nextLine());
		
		
		for (char letra :nome.toCharArray()) {
			System.out.println(letra);
			
		}
		
	}

}
