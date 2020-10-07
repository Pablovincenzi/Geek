package br.com.geek.secao11;

public class programa25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente joao = new Cliente("Pablo Vincenzi", "Rua duque");
		Cliente maria = new Cliente("Maria", "Rua duque");

		Conta contajoao = new Conta(1, 100f, 200f, joao);
		Conta contamaria = new Conta(1, 100f, 200f, maria);

		System.out.println("Saldo joao" + contajoao.saldo);
		contajoao.sacar(3000f);
		System.out.println(contajoao.saldo);
	}

}
