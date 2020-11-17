package br.com.geek.secao21;

import java.util.Arrays;

public class Vetor {
	private Aluno alunos[] = new Aluno[100];
	private int total = 0;

	// TODO receber um aluno
	public void adiciona(Aluno aluno) {
		this.garantirEspaco();
		this.alunos[total] = aluno;
		total = total + 1;
	}

	public Aluno pega(int posicao) {
		if (!posicaoOcupada(posicao))
			throw new IllegalArgumentException("Posi��o Inv�lida");

		return this.alunos[posicao];
	}

	public void adiciona(int posicao, Aluno aluno) {
		this.garantirEspaco();
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posucao INvalida");
		}
		for (int i = total - 1; i >= posicao; i -= 1) {
			alunos[i + 1] = alunos[i];
		}
		alunos[posicao]=aluno;
		total++;
	}

	public void remove(int posicao) {
		for (int i = posicao ; i<this.total; i++) {
			this.alunos[posicao]=this.alunos[i+1];
		}
		total--;
	}

	public boolean contem(Aluno aluno) {
		for (int i = 0; i < total; i++) {
			if (aluno.equals(alunos[i])) {
				return true;
			}

		}
		return false;
	}

	public int tamanho() {
		return this.total;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Arrays.toString(this.alunos);
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < total;
	}
	private void garantirEspaco() {
		//verifica se o array alinos esta cheio
		if(total==alunos.length) {
			//caso esteja cheio, cria um novo array com tamnaho dobrado
			Aluno novoArray[] = new Aluno[alunos.length*2];
			for (int i = 0; i <alunos.length; i++) {
				novoArray[i]=alunos[i];
				//copia para novo array
			}
			//copia para o array original
			this.alunos=novoArray;
		}
	}
}
