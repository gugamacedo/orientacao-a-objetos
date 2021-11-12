package aula14e15;

/* Exercícios
 * O compilador fornece um construtor padrão sem parâmetros em qualquer classe
 *      que não inclui explicitamente um construtor 
 * Se uma classe não incluir construtor, as variáveis de instância são
 *      inicializadas com strings vazias, números 0 e booleanos false
 * Uma das formas de reutilização de software é a criação de uma clsse que absorve
 *      membros de uma outra classe já existente. A nova classe é aprimorada com
 *      capacidades novas ou modificadas. Isso tudo faz parte do conceito de Herança
 * O proposito de uma classe abstrata é fornecer uma superclasse apropriada a partir
 *      da qual outras classes podem herdar e, assim, compartilhar um design em comum
 * Método abstrato é um método declarado, mas não implementado
 * A herança permite basear uma nova classe na definição de outra classe
 * Podemos sobrepor um comportamento de uma superclasse em uma subclasse
 * Com o mecanismo de herança, é possível estabelecer relacionamentos "é um" entre classes
 * Classes com a palavra final não podem ter subclasses
 * Os membros private de uma superclasse são herdados pelas suas subclasses
 * Um método public não pode mudar pra private ou protected
 * Um método protected só pode mudar pra public
 * Um método private pode mudar pra protected ou public
 * Utilizar acesso protected oferece um nível intermediário entre public e private
 * Polimorfismo paramétrico é o conceito que permite escrever programas que processam
 *      objetos que comparilham a mesma superclasse (direta e indiretamente) como se 
 *      todos fossem objetos dessa superclasse
 * Sobreacarga: quando se utiliza, dentro de uma mesma classe, um mesmo 
 *      nome de método para muitos métodos diferentes, e com assinaturas diferentes 
 * Faz parte da assinatura de um método: seu nome. qtd de parâmetros e seus tipos
 * Método final não pode ser sobrescrito
 * Classe abstrata nunca será instanciada
 * Classe final não pode ser superclasse
 * Método abstrato deve ter implementação na subclasse
 * A especialização permite que você remova da classe filha comportamentos e atributos
 */

public class Aula14e15 {
	public static void main(String[] args) {
		Video v[] = new Video[3];
		v[0] = new Video("Vídeo 1");
		v[1] = new Video("Vídeo 2");
		v[2] = new Video("Vídeo 3");
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Valdisnei", 30, "Rato");
		g[0].detalhes();
		g[1] = new Gafanhoto("Valdineia", 60, "Valdão");
		g[1].detalhes();
		
		Visualizacao vz1 = new Visualizacao(g[0], v[1]);
		vz1.detalhes();
		vz1.avaliar();
		v[1].detalhes();
		
		Visualizacao vz2 = new Visualizacao(g[1], v[1]);
		vz2.detalhes();
		vz2.avaliar(0);
		v[1].detalhes();
	}
}
