package br.com.geek.secao15;

public class Programa35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta c1 = new Conta( "Pablo");
		System.out.println(c1.getCliente() + " conta nu : "+c1.getNumero());

		System.out.println("A próxima conta será : " + Conta.proxConta());

	}

}
