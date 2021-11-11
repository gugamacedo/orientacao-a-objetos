package aula07e08;

public class Lutador {
	private String nome, nacionalidade, categoria;
	private int idade, vitorias, derrotas, empates;
	private float altura, peso;
	
	public void  apresentar() {
		System.out.printf("Lutador: %s\nNacionalidade: %s\nIdade: %d anos\nAltura: %.2f\nPeso: %.2f\nVitórias: %d\nDerrotas: %d\nEmpates: %d\n"
				, this.getNome(), this.getNacionalidade(), this.getIdade(), this.getAltura(), this.getPeso(), this.getVitorias(), this.getDerrotas(), this.getEmpates());
	}
	public void status() {
		System.out.printf("Lutador: %s\nCategoria: %s\nVitórias: %d\nDerrotas: %d\nEmpates: %d\n"
				, this.getNome(), this.getCategoria(), this.getVitorias(), this.getDerrotas(), this.getEmpates());
	}
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
	
	public Lutador(String nome, String nacionalidade, int idade, float altura,
			float peso, int vitorias, int derrotas, int empates) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
		this.altura = altura;
		this.setPeso(peso);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if (this.getPeso() < 55) {
			this.categoria = "Inválido";
		} else if(this.getPeso() < 70) {
			this.categoria = "Leve";
		} else if (this.getPeso() < 90) {
			this.categoria = "Médio";
		} else if (this.getPeso() < 120) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Inválido";
		}
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	
	
	
}
