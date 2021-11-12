package aula12;

public class Ave extends Animal {
	private String corPena;
	
	public void voar() {
		System.out.println("Tô voando allllto");
	}
	
	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

	@Override
	public void locomover() {
		System.out.println("Voando");	
	}

	@Override
	public void alimentar() {
		System.out.println("Frutas");
	}

	@Override
	public void emitirSom() {
		System.out.println("Piuuupiuuu");
	}
	
}
