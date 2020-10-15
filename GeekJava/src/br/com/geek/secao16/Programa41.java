package br.com.geek.secao16;

import java.util.Scanner;

public class Programa41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String curso = "Pablo";
		System.out.println(curso);
		curso = curso.replace("P", "C");
		System.out.println(curso);
		
		curso.charAt(1);
		
		for (int i = 0; i < curso.length(); i++) {
			System.out.println(curso.charAt(i));
			
		}
	}
}