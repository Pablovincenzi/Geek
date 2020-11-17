package br.com.geek.secao20;

public class BarradeProgresso implements Runnable {
	

	@Override
	public void run() {
		for (int i = 0; i < 100000; i++) {
			System.out.println("Barra de progresso...aguarde");
			
		}
	}
		
	

}
