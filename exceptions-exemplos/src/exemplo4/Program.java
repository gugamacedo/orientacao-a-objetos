package exemplo4;

public class Program {
	public static void main(String[] args) {
		try {
			Financiamento f = new Financiamento(1000.0, 100.0, 10);
			System.out.println(f.prestacao());			
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
}
