package exemplo2;

/* O Java separa os erros em dois tipos, dentro da interface Throwable:
 * 	Error: erros que não deveriam ser tratados por nossa aplicação
 * 	Exception: erros passiveis de serem tratados/previstos
 * 		Unchecked exception:
 * 			Runtime Excpetions
 * 				NullPointerException
 * 		Checked exceptions
 * 			IOException
 * 			SQLException
 */ 

public class Main {
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		try {
			conta.depositar(-1);			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
