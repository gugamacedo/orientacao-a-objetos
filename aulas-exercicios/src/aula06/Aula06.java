package aula06;

/* Encapsulamento
 * Encapsular é ocultar partes independentes da implementação, permitindo construir partes invisíveis ao mundo exterior.
 *	- Tornar mudanças invisíveis 
 *  - Facilitar a reutilização do código
 *  - Reduzir efeitos colaterais 
 * Um objeto encapsulado, possui uma interface bem definida
 * Interface: lista de serviços fornecidos por um componente. É o contato com o mundo exterior, que define o que pode ser com um objeto dessa classe.
 * (Encapsular não é obrigatório, mas é uma boa prática para produzir Classes mais eficientes.)
 * Obs:
 *	- Toda vez que encapsulamos, colocamos os atributos sempre em privados na Classe
 *  - O ControleRemoto (classe) IMPLEMENTA um Controlador (interface) e todos os métodos abstratos que estão definidos no Controlador (interface) vão ser definidos como "não abstratos" no ControleRemoto (classe), inclusive a visibilidade e etc...
 *  - Métodos abstratos sempre públicos, e definidos com a palavra 'abstract'
 * Atalho: Alt+Shift+S, Override/Implement Methods
 */

public class Aula06 {
	public static void main(String[] args) {
		ControleRemoto c = new ControleRemoto();
		c.ligar();
		c.play();
		c.maisVolume();
		c.abrirMenu();
		c.pause();
		c.ligarMudo();
		c.abrirMenu();
	}
}
