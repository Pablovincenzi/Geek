package br.com.geek.secao15;

public class Conta {
	private int numero;
	private String cliente;
	public static int contador=1;
	private float saldo;
	private float limite;

	public Conta( String cliente, int numero, float saldo, float limite) {
		
		this.numero = contador;
		this.cliente = cliente;
		this.numero=numero;
		this.saldo=saldo;
		

	}
	
	public static int proxConta() {
		return Conta.contador;
	}
	public  int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	
}
