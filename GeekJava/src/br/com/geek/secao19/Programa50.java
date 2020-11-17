package br.com.geek.secao19;

import java.util.HashMap;
import java.util.Map;

public class Programa50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> pessoas = new HashMap<Integer, String>();
		pessoas.put(25, "Pablo");
		pessoas.put(26, "Pablo02");
		pessoas.put(27, "Pablo03");
		
		pessoas.keySet().forEach(idade ->{
			System.out.println(pessoas.get(idade));
		});
	}

}
