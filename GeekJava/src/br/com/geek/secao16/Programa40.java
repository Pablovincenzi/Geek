package br.com.geek.secao16;

import java.util.Scanner;

public class Programa40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um numero para divisao");
		int num1 = sc.nextInt();

		System.out.println("Informe um numero 2 para divisao");
		int num2 = sc.nextInt();
		try {
			System.out.println(" Divisao" + num1 / num2);
		} catch (ArithmeticException e) {
			System.out.println("Não e possivel dividir por 0");

		}
		sc.close();
	}
}