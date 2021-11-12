package aula14e15;

public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected int xp;
	
	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.xp = 0;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public int getXp() {
		return xp;
	}


	public void setXp(int xp) {
		this.xp = xp;
	}


	protected void ganharXp() {
		
	}
	
	public void detalhes() {
		System.out.println("------------------------");
		System.out.printf("Nome: %s\nIdade: %d\nXP: %d\n", this.getNome(), this.getIdade(), this.getXp());
	}
}
