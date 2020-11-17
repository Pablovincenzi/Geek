package br.com.geek.secao21;

public class Aluno {
private String nome;
	public Aluno(String nome) {
		this.nome = nome;

	}
	
	public boolean equals(Object obj) {
		Aluno outro = (Aluno)obj;
		
		return outro.getNome().equals(this.nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return  this.nome;
		}

}
