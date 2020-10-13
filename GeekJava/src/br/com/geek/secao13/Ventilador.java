package br.com.geek.secao13;

public class Ventilador implements IEletronico{
	private boolean ligado = false;
	@Override
	public void ligar() {
		
		if(!this.ligado) 
			this.ligado=true;
		System.out.println("Ligado");
		
		
	}

	@Override
	public void desligar() {
		if(this.ligado) {
			this.ligado = false;
			System.out.println("Desliguei o aparelho");
		}
		
	}

}
