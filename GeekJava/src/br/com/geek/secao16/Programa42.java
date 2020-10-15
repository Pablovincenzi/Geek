package br.com.geek.secao16;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Programa42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);

		try {
			PrintStream escrever = new PrintStream("saida.txt");
			System.out.println("Escreva algo");
			String msg = tc.nextLine();
			escrever.println(msg);
			escrever.close();

		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não localizado");
		}

		
	}
}