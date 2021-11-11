package aula11;

public final class Bolsista extends Aluno {
	private float bolsa;

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
	public void renovarBolsa() {
		System.out.println("Renovando a bolsa do aluno " + this.nome);
	}

	@Override
	public void pagarMensalidade() {
		System.out.println("Bolsista pagou a mensalidade");
	}
	
}
