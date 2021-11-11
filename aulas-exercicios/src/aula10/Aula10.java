package aula10;

/* Herança
 * Muito parecido com a vida real, onde uma mãe (Superclasse) pode gerar uma filha (Subclasse)
 *     que HERDA suas características (atributos) e comportamentos (métodos)
 * Permite basear uma nova classe na definição de uma outra classe já existente
 * Pra fazer Herança não precisa necessariamente de Encapsulamento, e vice versa
 *     , mas lembre-se que é uma boa prática colocar Encapsulamento
 * A keyword pra Herança é EXTENDS. Exemplo: class Aluno extends Pessoa
 */

public class Aula10 {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		Aluno a = new Aluno();
		Professor pr = new Professor();
		Funcionario f = new Funcionario();
		
		p.setNome("Pedro");
		p.setIdade(18);
		a.setNome("Maria");
		a.setIdade(17);
		pr.setNome("Cláudia");
		pr.setIdade(36);
		f.setNome("Fernanda");
		f.setIdade(25);
		
		f.contratarFunc();
		f.falar();
		pr.setSalario(1300);
		pr.receberAumento(200);
		a.fazerMatricula();
		a.falar();
		p.falar();
	}
}
