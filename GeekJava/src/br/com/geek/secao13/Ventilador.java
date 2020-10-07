package br.com.geek.secao13;

public class Ventilador implements IEletronico{
	private boolean ligado = false;
	@Override
	public void ligar() {
		
		if(!this.ligado) 
			this.ligado=true;
		
		
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		
	}

}
