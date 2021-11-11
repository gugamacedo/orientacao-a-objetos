package aula10;

public class Funcionario extends Pessoa{
	private boolean trabalhando;

	public boolean getTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
	public void demitirFunc() {
		this.setTrabalhando(false);
		System.out.println(this.getNome() + " foi demitido(a)");
	}
	public void contratarFunc() {
		this.setTrabalhando(true);
		System.out.println(this.getNome() + " foi contratado(a)");
	}
}
