package app;

import util.List;

public class Program {

	public static void main(String[] args) {
		/*
		 *  Generics passa por "parâmetro" um tipo. Assim não precisa alterar no
		 *  	código inteiro. Você coloca o tipo que quer na hora de instanciar
		 *  O compilador verifica o tipo, evitando erro em tempo de execução
		 *  Não são somente as classes e interfaces que possuem a flexibilidade dos
		 *  	Generics, também podemos criar métodos genéricos
		 *  É possível herdar classes e métodos genéricas
		 *  Não é possível instanciar um tipo genérico utilizando tipos primitivos
		 *  Para isso Java possui classes que representam os tipos primitivos:
		 *  	int → Integer
		 *  	double → Double
		 */
		List<Double> l = new List<Double>();
		l.add(3.5);
		l.add(9.2);
		
		System.out.println(l);
	}
	
}