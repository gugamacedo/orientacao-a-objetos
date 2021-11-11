package aula04;

/* 
 * Métodos Acessores (Getters) 
 * Ao invés de permitir o acesso direto aos atributos, você tem que pedir ao Getter
 * Isso dá uma camada extra de segurança para a aplicação
 * 
 * Métodos Modificadores (Setters)
 * Mesma linha de raciocínio acima, porém ao invés de acessar, os Setters modificam
 * 
 * Método Construtor (Construct)
 * Como o nome diz, ele serve pra construir o objeto. Assim quando você instanciar
 * um objeto, já pode passar parâmetros nele que irão pro Método Construtor,
 * o qual vai atribuir os valores aos atributos, settar
 * Obs: de começo pode parecer um trabalhão, mas depois do Construct feito, 
 * 		todo novo objeto poderá settar o que você quer, em apenas uma linha.
 * 
 * Complementando com a aula passada, os Getters e Setters são public,
 * então você consegue acessar e modificar atributos privados chamando esses métodos
 * 
 * ATALHOS: no Eclipse IDE
 * 		- pra gerar um constructor Alt+Shift+S, e escolhe "Generate constructor fields"
 * 		- pra gerar getters e setters Alt+Shift+S, e escolhe "Generate setters and getters"
 */

public class Aula04 {
	public static void main(String[] args) {
		Caneta c1 = new Caneta("bic", "azul", 0.5f);
		System.out.printf("Modelo: %s\nPonta: %.1f\nCor: %s\nTampada? %b"
				, c1.getModelo(), c1.getPonta(), c1.getCor(), c1.getTampada());
		c1.rabiscar();
	}
}
