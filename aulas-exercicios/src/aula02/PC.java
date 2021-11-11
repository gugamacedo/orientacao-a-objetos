package aula02;

public class PC {
	String modelo;
	String marca;
	String cor;
	Boolean ligado;
	
	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Marca: " + this.marca);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ligado? " + this.ligado);
	}
	void ligar() {
		this.ligado = true;
	}
	void desligar() {
		this.ligado = false;
	}
	void digitar(){
		if (this.ligado == true) {
			System.out.println("Digitando...XVidros");
		} else if (this.ligado == false){
			System.out.println("O pai tá off");
		} 
	}
}
