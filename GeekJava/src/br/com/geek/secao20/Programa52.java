package br.com.geek.secao20;



public class Programa52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BarradeProgresso barra = new BarradeProgresso();
		Thread t1 = new Thread(barra);
		t1.start();
		
		
		
		GeraRelatorio rela = new GeraRelatorio();
		Thread t12 = new Thread(rela);
		t12.start();

	}

}
