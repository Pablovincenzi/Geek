package br.com.geek.secao21;
/** 
 * Classe que representa uma celular
 * @author S208
 *
 */


public class Celula {
	private Object elemento;
	private Celula proximo;
	
		public Celula(Object elemento, Celula proximo) {
			this.elemento=elemento;
			this.proximo=proximo;
		}

		public Object getElemento() {
			return elemento;
		}

		public void setElemento(Object elemento) {
			this.elemento = elemento;
		}

		public Celula getProximo() {
			return proximo;
		}

		public void setProximo(Celula proximo) {
			this.proximo = proximo;
		}
		
		
		
		
}
