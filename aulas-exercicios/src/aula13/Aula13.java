package aula13;

/* Polimorfismo de Sobrecarga
 * Métodos com o mesmo nome, na mesma classe, mas
 * 		com assinaturas diferentes (quantidade e tipos de parâmetros)
 */

public class Aula13 {
	public static void main(String[] args) {
		Lobo l = new Lobo();
		l.emitirSom();
		
		System.out.println("-----------------");
		Cachorro c = new Cachorro();
		c.reagir("comida");
		c.reagir("bobo");
		c.reagir(11);
		c.reagir(19);
		c.reagir(true);
		c.reagir(false);
		c.reagir(2, 12.5f);
		c.reagir(17, 4.5f);
	}
}
