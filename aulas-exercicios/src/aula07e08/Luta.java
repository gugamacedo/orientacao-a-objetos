package aula07e08;

import java.util.Random;

public class Luta {
	private Lutador desafiado, desafiante;
	private int rounds;
	private boolean aprovada;
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
			this.setAprovada(true);
			this.setDesafiado(l1);
			this.setDesafiante(l2);
		} else {
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
		}
	}
	public void lutar() {
		if (this.getAprovada() == true) {
			System.out.println(">>> Desafiado <<<");
			this.getDesafiado().apresentar();
			System.out.println("==========================");
			System.out.println(">>> Desafiante <<<");
			this.getDesafiante().apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); // 0 1 2
			System.out.println("==========================");
			switch(vencedor) {
				case 0: // Empate
					System.out.println("Empatou!");
					this.getDesafiado().empatarLuta();
					this.getDesafiante().empatarLuta();
					break;
				case 1: // Desafiado vence
					System.out.println(this.getDesafiado().getNome() + " venceu!");
					this.getDesafiado().ganharLuta();
					this.getDesafiante().perderLuta();
					break;
				case 2: // Desafiante ganhou
					System.out.println(this.getDesafiante().getNome() + " venceu!");
					this.getDesafiante().ganharLuta();
					this.getDesafiado().perderLuta();
					break;
			}
		} else {
			System.out.println("A luta não pode acontecer!");
		}
	}
	
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean getAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
}
