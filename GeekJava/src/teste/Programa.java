package teste;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto p1 = new Produto();
		p1.nome = "Coca";
		p1.preco = 2367f;
		p1.desconto = 15f;
		
		Pessoa p2 = new Pessoa("Pablo Vincenzi", "pablo@gba", 1994);
		
		p2.imprimeDados();
		
	}

}
