package maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TestandoMap {
	public static void main(String[] args) {
		// Representado pela Interface Map (possuindo HashMap, TreeMap e LinkedHashMap)
		// Difernete do List e Set, Map NÃO herda de Collections
		// Mas assim como o Set, não permite elementos duplicados
		// no generics ele recebe <key, value> O key é um identificador e value valor
		Map<String, Double> cupons = new LinkedHashMap<>();
		cupons.put("CP1", 10.55);
		// você já percebe a diferença aqui, pelo fato de não herdar de Collections, não possuí o .add() e sim o .put()
		cupons.put("CP2", 8.77);
		cupons.put("CP3", 4.33);
		cupons.put("CP4", 12.88);
		cupons.put("CP5", 12.88);
		cupons.put("CP5", 14.22); // ele sobrescreve a chave CP5
		System.out.println(cupons);
		System.out.println("Valor do cupom: " + cupons.get("CP5"));
		System.out.println("Verificando se cupom existe..." + cupons.containsKey("CP1"));
		Set<String> chaves = cupons.keySet();
		System.out.println(chaves);
		for (Map.Entry<String, Double> entrada: cupons.entrySet()) {
			System.out.println(entrada.getKey() + " => " + entrada.getValue());
		}
	}
}