package br.com.geek.secao12;

public class Professor extends Pessoas {
	private String matricula;

	public Professor(String nome, int ano_nas, String matricula, String email) {
		super(nome, ano_nas, email);
this.matricula=matricula;
	}

	

	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String toString() {
		return super.toString() + "Matricula :" + this.matricula;
	}
	
	public String getNome() {
		return "Professor" + this.getNome();
	}
}
