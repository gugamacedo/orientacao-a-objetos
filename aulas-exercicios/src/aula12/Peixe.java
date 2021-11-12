package aula12;

public class Peixe extends Animal {
	private String corEscama;
	
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	public void soltarBolhas() {
		System.out.println("°°°°°°°°°");
	}
	
	@Override
	public void locomover() {
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo alguma coisa");
	}

	@Override
	public void emitirSom() {
		System.out.println("Nada");
	}
	
}
