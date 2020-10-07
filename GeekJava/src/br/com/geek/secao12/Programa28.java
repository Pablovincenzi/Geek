package br.com.geek.secao12;

public class Programa28 {

	public static void main(String[] args) {
		Pessoas p1 = new Pessoas("Pessoas 1", 1994, "pessoas@pessoas");
		System.out.println(p1);
		
		Aluno al1 = new Aluno("Aluno1", 1993, "Aluno@auno", "RAAL12121");
		System.out.println(al1);
		Professor prof1 = new Professor("Professor", 1976, "ABC123", "email@professora");
		System.out.println(prof1);
		
		System.out.println(prof1.getMatricula());
	}

}
