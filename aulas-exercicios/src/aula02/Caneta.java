package aula02;

public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void status() {
		// this faz referência ao objeto que a chamou (no caso o c1)
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}
	
	void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Não posso, estou tampada :(");
		} else {
			System.out.println("Rabiscando sdfxchsdfajlcdk");
		}
	}
	void tampar() {
		this.tampada = true;
	}
	void destampar() {
		this.tampada = false;
	}

}