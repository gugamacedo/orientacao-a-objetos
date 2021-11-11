package aula03;

/* 
 * Modificadores de Visibilidade
 * Indicam o nível de acesso aos componentes internos de uma classe (atributos e métodos)
 * + público: todo atributo/método definido assim, a classe atual e todas outras classes 
 * podem ter acesso a ela (todo mundo pode ver e alterar) 
 * - privado: somente a classe atual terá acesso
 * # protegido: a classe atual e sub-classes
 * 
 * Obs: a visibildiade padrão é  "pública para pacote". Você só terá problema com 
 * 		isso caso houver interação entre atributos/métodos entre pacotes no projeto
 */

public class Aula03 {
	public static void main(String[] args) {
		Caneta c1 = new Caneta(); // instanciando
		c1.modelo = "bic";
		c1.cor = "azul";
		
		// c1.ponta = 0.5f; não dá pra alterar pois é privado
		
		c1.carga = 80; /* ele deixou alterar um atributo protegido porque 
		* ele está dentro de uma classe que utiliza a classe Caneta */
		
		//c1.tampada = true; não dá porque tá privado :(
		
		c1.tampar(); /* apesar do atributo 'tampada' ser privado, o método 'tampar()' 
		* é público, então ela vai lá executar a função, que altera o atributo 
		* privado 'tampa', que por estar dentro da própria classe (arquivo), 
		* permite a alteração MIND BLOWING */
		
		/* O Guanabara deu uma explicação show sobre isso acima.
		 * Pense num caixa de mercado. Você vai lá compra algo, chegando no caixa
		 * você paga para o atendente. Você não pode abrir a caixa registradora e 
		 * colocar o dinheiro lá, pois só quem tem ACESSO é o atendente. Então você
		 * dá o dinheiro pra ele porque seu acesso ao atendente é público, porém 
		 * o acesso dele ao caixa é privado, então ele pode colocar o dinheiro lá
		 */
		
		c1.status();
		c1.rabiscar();
	}
}