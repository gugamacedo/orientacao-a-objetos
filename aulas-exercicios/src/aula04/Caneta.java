package aula04;

public class Caneta {
	public String modelo;
	private float ponta;
	private Boolean tampada;
	private String cor;

	public void tampar() {
		tampada = true;
	}
	
	public void destampar() {
		tampada = false;
	}
	public void rabiscar() {
		if (tampada == false) {
			System.out.println("\nRabiscando TCHACKI TCHACKI TCHACKI ");
		} else {
			System.out.println("\nTô tampada mané!");
		}
	}
	
	public Caneta(String modelo, String cor, float ponta) {
		super();
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;
		this.destampar();
	}

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPonta() {
		return ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	public Boolean getTampada() {
		return tampada;
	}
	public void setTampada(Boolean tampada) {
		this.tampada = tampada;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
}
