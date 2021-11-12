package exemplo2;

public class Conta {
	private int identificador;
	private double saldo;
	
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) throws Exception {
		if (valor < 0) {
			//IllegalArgumentException erro = new IllegalArgumentException("Não é permitido depositar valor negativo");
			Exception erro = new Exception("Não é permitido depositar valor negativo");
			throw erro;
		} else {
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("Depósito feito");			
		}
	}
}
