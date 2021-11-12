package exemplo1;

public class Main {
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		agenda.adiciona("Maria");
		agenda.adiciona("Roberto");
		agenda.adiciona("Rafaela");
		
		String[] nomes = agenda.getNomes();
		
		try {
			for (int i = 0; i< nomes.length; i++) {
				
				if (nomes[i] != null) {
					System.out.println(nomes[i]);
				}
			}
			
		} /*catch(Exception ex) {
			ex.printStackTrace();
		}*/ catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Indice inexistente");
		} catch (NullPointerException ex) {
			System.out.println("O array não foi instanciado");
		} finally {
			System.out.println("Executando mesmo com exceptions");
		}
		System.out.println("Fui executado");
	}
}