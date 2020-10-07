package br.com.geek.secao12;

public abstract class Pessoas {
	private String nome;
	private int ano_nascimento;
	private String email;

	public Pessoas(String nome, int ano_nas, String email) {
		this.ano_nascimento = ano_nas;
		this.nome = nome;
		this.email = email;

	}
	public abstract void outraMensagem(String texto);

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno_nascimento() {
		return ano_nascimento;
	}

	public void setAno_nascimento(int ano_nascimento) {
		this.ano_nascimento = ano_nascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "nome : " + this.nome + "Ano Nascimento" + this.ano_nascimento;

	}
}
