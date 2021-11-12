package aula12;

/* Polimorfismo
 * Poli = muitas    Morfismo = formas
 * Permite que um mesmo nome represente vários comportamentos diferentes
 * 
 * Assinatura do método: quantidade e os tipos dos parâmetros (não importa o retorno)
 * 
 * Tipos de Polimorfismo: Sobreposição, Sobrecarga
 * Sobreposição: acontece quando substituimos um método de uma Supeclasse na sua
 * subclasse, usando a mesma assinatura 
 * 
 * Sobreposição: mesma assinatura, com @Override e diferentes classes
 * Sobrecarga: assinatura diferente, sem @Override e mesma classe
 */

public class Aula12 {
	public static void main(String[] args) {
		
		Canguru cg = new Canguru();
		Cachorro ch = new Cachorro();
		Cobra cb = new Cobra();
		Tartaruga t = new Tartaruga();
		GoldFish gf = new GoldFish();
		Arara a = new Arara();
		
		System.out.println("Canguru");
		cg.locomover();
		cg.emitirSom();
		
		System.out.println("\nCachorro");
		ch.locomover();
		ch.emitirSom();
		
		System.out.println("\nTartaruga");
		t.locomover();
		
		System.out.println("\nCobra");
		cb.locomover();
		
		System.out.println("\nArara");
		a.voar();	

		System.out.println("\nGoldFish");
		gf.soltarBolhas();
		
		/*
		 * Mamifero m = new Mamifero();
		 * Reptil r = new Reptil();
		 * Peixe p = new Peixe();
		 * Ave a = new Ave();
		 * 
		 * m.setPeso(35.3f);
		 * m.setCorPelo("Marrom");
		 * 
		 * // mesmo método, respostas diferentes :D
		 * m.locomover();
		 * r.locomover();
		 * p.locomover();
		 * a.locomover();
		 */

	}
}
