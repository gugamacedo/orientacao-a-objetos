package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class TestandoListas {
	public static void main(String[] args) {
		// Collections implementa Listas, Conjuntos e Maps 
		
		String aula1 = "Aula T1";
		String aula2 = "Aula R2";
		String aula3 = "Aula M3";
		String aula4 = "Aula B4";
		// Lista é uma Interface de ArrayList (existe VectorList, etc...)
		List<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		aulas.add(aula4);
		System.out.println(aulas);
		aulas.remove(3);
		for (String aula : aulas) {
			System.out.println(">>>" + aula + "<<<");
		}
		for (int i=0; i < aulas.size(); i++) {
			System.out.println("---" + aulas.get(i) + "---");
		}
		aulas.add(0, "Aula B4");
		Collections.sort(aulas);
		aulas.forEach(aula -> {System.out.println("==="+aula+"===");});
	}
}
