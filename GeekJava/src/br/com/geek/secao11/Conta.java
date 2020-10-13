package br.com.geek.secao11;

public class Conta {
	float  limite;
	float saldo;
	int numero;
	Cliente cliente;
	
	public Conta(int numero, float saldo, float limite, Cliente cliente) {
		this.cliente=cliente;
		this.numero=numero;
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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "O saldo e" + this.saldo;
		
	}


	public float getLimite() {
		return limite;
	}


	public float getSaldo() {
		return saldo;
	}


	public int getNumero() {
		return numero;
	}


	public Cliente getCliente() {
		return cliente;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Conta verificar = (Conta) obj; // CAST para passar transormar a variavel em OBJ tipo  conta
		return verificar.getSaldo() == this.getSaldo();
	}
}
