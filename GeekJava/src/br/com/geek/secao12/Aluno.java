package br.com.geek.secao12;

public class Aluno extends Pessoas {
	private String ra;

	public Aluno(String nome, int ano_nas, String email, String ra) {
		super(nome, ano_nas, email);
		this.ra= ra;
	}

	

	public String getRa() {
		return this.ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
		
	}
	
	public String toString() {
		return super.toString() + "\nR.A.:" + this.ra;
	}
	public String getNome() {
		return "Aluno" + this.getNome();
	}



	@Override
	public void outraMensagem(String texto) {
		System.out.println(texto);
		
	}
}
