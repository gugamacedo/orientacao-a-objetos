package exemplo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		// for, while -> loops explícitos (você controla o loop, então fica mais verboso e complexo)
		// stream -> loops implícitos (não é você que controla o loop, então escreve bem menos e fica muito mais simples)
		// até para manutenção isso ajuda, já que em um loop explicito você precisa entender todo flow. 
		// Fora que ainda tem que ficar fazendo variaveis de controle, soma, etc. No loop implicito é só olhar por cima
		List<Integer> lista = Arrays.asList(1, 5, 8, 9, 1, 4, 7, 6, 6, 9, 9);
		
		// stream = fluxo de dados
		lista.stream()
		//.skip(2)// pula os 2 primeiros
		//.skip(3)// operação intermediária, não é final, pode fazer várias
		//.limit(4)// limita quantos números você quer ver
		.distinct()// ignora elementos repetidos
		//.filter(e -> e % 2 == 0)// esse é um filtro mais personalizado. Se puder usar os outros filtros, use antes desse
		.map(e -> e * 2)// faz uma transformação/alteração de dados. Apesar do nome, não confunda com a Interface Map
		// as alterações não acontecem na lista original, é à parte. Tanto que se quiser usar, guarde o resultado em uma variável
		// assim como o filter, se puder, use os outros filtros antes do map, é mais eficiente
		.forEach(e -> System.out.println(e)); // terminal operation, morre aqui
		
		// outras terminal operation
		long contador = lista.stream().filter(e -> e % 2 == 0).count();
		System.out.println(contador);
		
		Optional<Integer> maximo = lista.stream().filter(e -> e % 2 == 0).max(Comparator.naturalOrder());
		System.out.println(maximo.get());
		
		// com collectors (não confunda com colletions)
		// armazenando a nova lista
		List<Integer> novaLista = lista.stream().map(e -> e * 3).collect(Collectors.toList());
		System.out.println(novaLista);
		
		// agrupando
		Map<Boolean, List<Integer>> outraLista = lista.stream().map(e -> e * 3).collect(Collectors.groupingBy(e -> e % 2 == 0));
		System.out.println(outraLista);
		
		Map<Integer, List<Integer>> maisLista = lista.stream().map(e -> e * 3).collect(Collectors.groupingBy(e -> e % 2));
		System.out.println(maisLista);
		
 	}
}
