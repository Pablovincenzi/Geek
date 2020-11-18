package br.com.geek.secao21;

public class ListaLigada {
	private Celula ultima = null;
	private Celula primeira = null;
	private int total = 0;

	/**
	 * Metodos que adiciona no inicio da lista
	 * 
	 * @param elemento
	 */
	public void adicionaNoComeco(Object elemento) {
		Celula nova = new Celula(elemento, this.primeira);
		this.primeira = nova;
		if (this.total == 0) {
			this.ultima = this.primeira;
		}
	}

	public void adiciona(Object elemento) {
		if (this.total == 0) {
			this.adicionaNoComeco(elemento);
		} else {
			Celula nova = new Celula(elemento, null);
			this.ultima.setProximo(nova);
			this.ultima = nova;
			this.total += 1;
		}
	}

	public void adiciona(int posicao, Object elemento) {
		// TODO

	}

	public Object pega(int posicao) {
		// TODO
		return null;
	}

	public void remove(int posicao) {

	}

	public int tamanho() {
		return 0;
	}

	public boolean contem(Object obj) {
		return false;
	}

	@Override
	public String toString() {
		if (total == 0) {
			return "[]";
		}
		Celula atual = primeira;
		StringBuilder builder = new StringBuilder("[");

		for (int i = 0; i < total; i++) {
			builder.append(atual.getElemento());
			builder.append(",");
			atual = atual.getProximo();

		}
		builder.append("]");
		return builder.toString();
	}
}
