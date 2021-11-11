package aula05;

/*
 * Duas pessoas querem abrir uma conta no banco, o Jubileu e a Creusa. 
 * O Jubileu optou por abrir uma conta corrente, e irá deposita 100 reais na sua conta. 
 * A Creusa, possuir mais dinheiro e quer depositar 500 reais em uma conta poupança.
 * Depois a Creusa saca 100 reais. 
 * Mas para isso, eles precisam abrir uma conta no banco. 
 * 
 * Requisitos: 
 * 1. O tipo da conta só aceita dois caracteres, cc e cp. 
 *    Conta corrente e conta poupança, respectivamente.
 * 2. Na hora de abrir conta, eu mudo o status de falso para verdadeiro 
 *    e se a conta for cp ganha 150 reais, se for cc ganha 50 reais.
 * 3. Para fechar conta não pode ter dinheiro dentro ou saldo devedor
 * 4. Para fazer um depósito ou sacar, a conta já deve ter sido aberta (com status verdadeiro) 
 *    No caso do saque, tem que ter o valor >= no saldo.
 * 5. A taxa será cobrada diretamente do saldo. Na hora que for chamado a taxa, para
 *    o cliente com cc pagará 12 reais, e o cliente com cp pagará 20 reias
 * 6. Precisará usar o método getter e setter para todos atributos.
 * 7. No método construtor sempre que uma nova conta for criada seu status será definido
 * 	  como falso (pois a conta está criada mas não aberta???) e o saldo como zero
 *
 * ContaBanco
 * --------------
 * + numConta
 * # tipo
 * - dono
 * - saldo
 * - status
 * --------------
 * + abrirConta()
 * + fecharConta()
 * + depositar()
 * + sacar()
 * + taxarConta()
 * --------------
 * 
 * todos os métodos especiais (getter e setter) devem ser públicos 
 * e os demais métodos, privados
 */

public class Aula05 {
	public static void main(String[] args) {
		ContaBanco c1 = new ContaBanco();
		c1.setPessoa("Jubileu");
		c1.setNumConta(123);
		c1.abrirConta("cc");
		c1.depositar(100);
		c1.status();
		c1.sacar(150);
		c1.fecharConta();
		c1.status();
	
		ContaBanco c2 = new ContaBanco();
		c2.setPessoa("Creusa");
		c2.setNumConta(456);
		c2.abrirConta("cp");
		c2.depositar(500);
		c2.sacar(100);
		c2.status();

	}
}
