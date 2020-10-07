package teste;

public abstract class Pessoa {
	String nome;
	int ano_nascimento;
	String email;

	public Pessoa(String nome, String email, int ano_nascimento) {
		this.nome = nome;
		this.ano_nascimento = ano_nascimento;
		this.email=email;
		
	}
	void imprimeDados() {
		System.out.println(this.nome+" "+ this.email);
	}

}
