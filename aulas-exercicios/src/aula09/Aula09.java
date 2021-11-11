package aula09;

import aula07e08.Luta;

/* Exercícios
 * 
 * Uma casa está para uma planta arquitetônica, assim como um objeto está para? Uma classe
 * A POO se preocupa em produzir software que tenha as seguintes características: 
 * 		Confiável, oportuno, manutenível extensível, reutilizável, natural
 * Alguns conceitos de POO: 
 * 		Um Objeto é uma instância de uma Classe. 
 * 		Em uma linguagem de POO pura tudo é objeto, desde os tipos mais básicos.
 * 		Uma Classe define os atributos e comportamentos (métodos) compartilhafos por um tipo de objeto 
 * 		Um Objeto é a construção de software que encapsula estado e comportamento
 * 		Atributos são características de uma classe visiveis exeternamente
 * 		O estado de um objeto é o significado combinado das variaveis internas do objeto
 * 		Uma variável interna é um valor mantido dentro do objeto
 * 		Classes são tipos abstratos de dados
 * 		Métodos são subprogramas que definem operações em objetos de uma classe
 * Métodos:
 * 		Acessor: métodos que dão acesso aos dados internos
 * 		Modificador/Mutante: métodos que perimitem que se altere o estado de um objeto
 *		Construtor: métodos usados para inicializar objetos com algum estado, durante sua instanciação
 * Pilares da POO: Só lembrar qual a marca do seu notebook? É HP (encapsulamento, herença, polimorfismo)
 * Interface: define o que uma entidade pode fazer com um objeto (os métodos abstratos)
 * 3 níveis de acesso em POO: público (public), privado (private) e protegido (protected)
 * 		O nível protegido apenas garante o acesso para aquele objeto e suas subclasses
 * Sobre Encapsulamento, enquanto a implementação define os detalhes internos, a interface lista os serviços fornecidos.
 * Abstração: em POO significa representar uma entidade incluindo apenas seus atributos mais reelvantes
 *  
 */
public class Aula09 {
	public static void main(String[] args) {
		Pessoa p[] = new Pessoa[3];
		p[0] = new Pessoa("João", 17);
		p[1] = new Pessoa("Maria", 16);
		p[2] = new Pessoa("Creusa", 80);

		p[1].status();
		p[1].fazerNiver();
				
		Livro l[] = new Livro[2];
		l[0] = new Livro("Bino", "É uma cilada!", 5, p[0]);
		l[1] = new Livro("Pedro", "Corre Bino!", 5, p[2]);
		
		l[0].detalhes();
		l[0].abrir();
		l[0].pularPg(5);;
		l[0].voltarPg();
		l[0].avancarPg();
		l[0].avancarPg();
		
		l[1].detalhes();
		l[1].avancarPg();
		l[1].abrir();
		l[1].pularPg(6);
	}
}
