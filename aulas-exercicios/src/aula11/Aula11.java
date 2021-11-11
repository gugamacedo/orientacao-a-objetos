package aula11;

/* Árvore de Herança
 * Quase toda Superclasse pode também ser subclasse
 * A Superclasse que não é Subclasse é a raiz
 * As Sublclasses que não são Superclasses são as folhas
 * Os conceitos de Ancestral e Descendente também estão presentes. ((não conta o nó raiz))
 * Generalização: de baixo pra cima. Especialização: de cima pra baixo
 * Herança para implementação (pobre): uma herança que não adiciona novos atributos ou métodos
 * Herança para diferença: uma herança que adiciona novos atributos ou métodos
 */

/* Outros conceitos
 * Classe abstrata: não pode ser instanciada (gerar objetos). Só serve como progenitora.
 * Método abstrato: declarado, mas não implementado na progenitora. Tipo os métodos de Interfaces
 * OBS: sempre que tiver um método abstrato, a classe obrigatoriamente é abstrata
 * Classe Final: não pode herdade por outra classe. Obrigatoriamente folha. Não pode ter filhas (estéril)
 * Método final: não pode ser sobrescrito pelas suas subclasses. Obrigatoriamente herdado. 
 */
public class Aula11 {
	public static void main(String[] args) {
		Visitante v1 = new Visitante();
		v1.setNome("Ronaldo");
		v1.setIdade(66);
		System.out.println(v1.getNome() + v1.getIdade());
		System.out.println("");
		
		Aluno a1 = new Aluno();
		a1.setNome("Ronalda");
		a1.setCurso("Java");
		a1.setIdade(20);
		a1.setMatr(232323);
		a1.pagarMensalidade();
		System.out.println("");
		
		Bolsista b1 = new Bolsista();
		b1.setNome("Mário");
		b1.setIdade(22);
		b1.renovarBolsa();
		b1.pagarMensalidade();
		System.out.println("");
		
		Professor p1 = new Professor();
		p1.setNome("Robeto");
		p1.setSalario(1000);
		p1.receberAumento(200);
		System.out.println("");
		
		Tecnico t1 = new Tecnico();
		t1.praticar();
	}
}
