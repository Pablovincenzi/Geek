package br.com.geek.secao11;

public class Conta {
	float  limite;
	float saldo;
	int conta;
	Cliente cliente;
	
	public Conta(int numero, float saldo, float limite, Cliente cliente) {
		this.cliente=cliente;
		this.conta=conta;
		this.limite=limite;
		this.saldo=saldo+this.limite;
		
	}
	
	
	void sacar( float valor) {
		if(valor<= this.saldo) {
		this.saldo= saldo-valor;
	}else {
		System.out.println("Saldo insuficiente");
	}}
	
	void depositar(float valor) {
		this.saldo+=valor;
	}
}
