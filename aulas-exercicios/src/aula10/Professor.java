package aula10;

public class Professor extends Pessoa {
	private float salario;
	
	public void receberAumento(float aumento) {
		this.setSalario(this.getSalario() + aumento);
		System.out.println("O professor(a) " + this.getNome() + " recebeu o aumento\nNovo salário R$" + this.getSalario());
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
}
