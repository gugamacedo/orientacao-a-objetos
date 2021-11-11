package aula02;

public class Exercicio {
	public static void main(String[] args) {
		PC p1 = new PC(); // instanciando
		p1.cor = "cinza";
		p1.marca = "hp";
		p1.modelo = "ProBook 6450b";
		p1.ligar();
		System.out.println("---------------------------");
		p1.status();
		p1.digitar();
		System.out.println("---------------------------");

		PC p2 = new PC(); // instanciando
		p2.cor = "preto";
		p2.marca = "hp";
		p2.modelo = "ProBook 6650b";
		p2.desligar();
		System.out.println("---------------------------");
		p2.status();
		p2.digitar();
		System.out.println("---------------------------");
		
		Estudo e1 = new Estudo(); // instanciando
		e1.dailyHours = 5;
		e1.daysWeek = 5;
		e1.materia = "Java";
		e1.estudar();
		System.out.println("---------------------------");
		e1.status();
		e1.escrever();
		System.out.println("---------------------------");
		
		Estudo e2 = new Estudo(); // instanciando
		e2.dailyHours = 5;
		e2.daysWeek = 5;
		e2.materia = "Estatística";
		e2.descansar();
		System.out.println("---------------------------");
		e2.status();
		e2.escrever();
		System.out.println("---------------------------");
	}
}
