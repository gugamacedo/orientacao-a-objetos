package aula02;

public class Estudo {
	int dailyHours;
	int daysWeek;
	String materia;
	Boolean estudando;
	
	void status() {
		System.out.println("Horas de estudo por dia: " + this.dailyHours);
		System.out.println("Dias de estudo por semana: " + this.daysWeek);
		System.out.println("Matéria: " + this.materia);
		System.out.println("Estudando? " + this.estudando);	
	}
	void estudar(){
		this.estudando = true;
	}
	void descansar() {
		this.estudando = false;
	}
	void escrever(){
		if (this.estudando == true) {
			System.out.println("Escrevendo...");
		} else {
			System.out.println("Sem tempo irmão, tô descansando");
		}
	}
}
