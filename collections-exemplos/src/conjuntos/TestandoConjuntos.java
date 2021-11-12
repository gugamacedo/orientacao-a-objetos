package conjuntos;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestandoConjuntos {
	public static void main(String[] args) {
		// Representado pela Interface Set (possuindo HashSet, TreeSet e LinkedHashSet)
		// Não permite elementos duplicados
		// Assim como List, herda de Collection
		Set<Funcionario> funcionarios = new LinkedHashSet<>();
		// HashSet não é linear igual a lista
		// sendo assim não tem como localizar um elemento pela posição
		// Porém o LinkedHashSet é linear
		// Já a estrutura TreeSet apesar de não ser linear, se auto organiza (123, abc)
		funcionarios.add(new Funcionario(1, "Ana"));
		funcionarios.add(new Funcionario(2, "Luiz"));
		funcionarios.add(new Funcionario(3, "Roberto"));
		funcionarios.add(new Funcionario(2, "Ana"));
		funcionarios.add(new Funcionario(4, "Ana"));
		//nomes.add("Ana"); // não duplica
		funcionarios.forEach(func -> {System.out.println(func);});
	}
}
