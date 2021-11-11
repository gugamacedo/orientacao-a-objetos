package aula02;

/* 
 * O que é um Objeto?
 * Coisa material ou abstrata que pode ser percebida pelos sentidos 
 * e descrita por meio de suas características, comportamentos e estado atual
 * 
 * Todo objeto, como dito acima, tem Atributos (características), Métodos (comportamentos) e Estado
 * Exemplo, o Objeto Caneta:
 * Atributos: modelo, cor, ponta, tampa, carga
 * Métodos: escrever, rabiscar, tampar, destampar
 * Estado: carga ou sem carga, tampada ou destampada, etc
 * 
 * O que é uma Classe?
 * Sempre que pensar em Classe, pense em Molde
 * Ex: o Objeto Caneta pode ter tributos, metódos e estados diferentes, mas a Classe Caneta possuí um Molde comum
 * 
 * Instanciar é quando consigo gerar um Objeto a partir de uma Classe
 * Ex:  c1 = nova Caneta
 * 		c1.cor = "azul";
 * 		c1.ponta = 0.5;
 * 		c1.tampada = false;
 * 		c1.rabiscar();
 * 
 * 		c2 = nova Caneta;
 * 		c2.cor = "vermelha"
 * 		..................
 * 
 * Acima você percebe que c1 e c2 são objetos diferentes, sem relação alguma,
 * com exceção de terem vindo da mesma Classe, molde
 * 
 * Classe: define os atributos e métodos comuns que serão compartilhados por um objeto
 * Objeto: é a instância de uma Classe.
 */

public class Aula02 {
	public static void main(String[] args) {
		Caneta c1 = new Caneta(); // instanciando
		c1.modelo = "bic";
		c1.cor = "azul";
		c1.ponta = 0.5f;
		c1.carga = 100;
		c1.destampar();
		System.out.println("---------------------------");
		c1.status();
		c1.rabiscar();
		System.out.println("---------------------------");

		Caneta c2 = new Caneta(); // instanciando outra caneta
		c2.modelo = "fabber castell";
		c2.cor = "preta";
		c2.ponta = 0.5f;
		c2.carga = 90;
		c2.tampar();
		System.out.println("---------------------------");
		c2.status();
		c2.rabiscar();
		System.out.println("---------------------------");
	}
}