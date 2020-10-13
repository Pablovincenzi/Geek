package br.com.geek.secao16;

import java.util.Scanner;

public class Programa37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe n1");
		int n1=sc.nextInt();
		
		System.out.println("Informe n2");
		int n2=sc.nextInt();
		try {
			System.out.println(divisao(n1, n2));
		} catch (Exception e) {
			// TODO: handle exception
		}
	
}

	
	public static int divisao(int n1 , int n2)throws Exception {
		return n1/n2;
	}

	
}