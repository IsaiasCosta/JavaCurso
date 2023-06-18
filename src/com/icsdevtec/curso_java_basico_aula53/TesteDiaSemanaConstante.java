package com.icsdevtec.curso_java_basico_aula53;

public class TesteDiaSemanaConstante {

	public static void main(String[] args) {
		usandoConstante();
		
		usandoEnum();
	}

	private static void usandoConstante() {
		int domingo = DiaSemanaConstante.DOMINGO;
		int segunda = DiaSemanaConstante.SEGUNDA;
		int terca = DiaSemanaConstante.TERCA;
		int quarta = DiaSemanaConstante.QUARTA;
		int quinta = DiaSemanaConstante.QUINTA;
		int sexta = DiaSemanaConstante.SEXTA;
		int sabado = DiaSemanaConstante.SABADO;
		System.out.println("Usando Constante Java");
		imprimeDiaSemana(domingo);
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);

	}

	private static void imprimeDiaSemana(int dia) {
		switch (dia) {
		case 1:
			System.out.println("Domingo: ");
			break;
		case 2:
			System.out.println("Segunda-feira: ");
			break;
		case 3:
			System.out.println("Terça-Feira: ");
			break;
		case 4:
			System.out.println("Quarta-Feira: ");
			break;

		case 5:
			System.out.println("Quinta-Feira: ");
			break;

		case 6:
			System.out.println("Sexta-Feira: ");
			break;

		case 7:
			System.out.println("Sabado: ");
			break;
		}
	}
	private static void usandoEnum() {

		DiaSemana segunda = DiaSemana.SEGUNDA;
		DiaSemana terca = DiaSemana.TERCA;
		DiaSemana quarta = DiaSemana.QUARTA;
		DiaSemana quinta = DiaSemana.QUINTA;
		DiaSemana sexta = DiaSemana.SEXTA;
		DiaSemana sabado = DiaSemana.SABADO;
		DiaSemana domingo = DiaSemana.DOMINGO;
		
		System.out.println(" ================== Usando Enum ================= ");
		
		
		imprimeDiaSemana(domingo);
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
	}

	private static void imprimeDiaSemana(DiaSemana dia) {

		switch (dia) {
		case SEGUNDA: 
			System.out.println("Segunda-feira: ");
			break;

		case TERCA: 
			System.out.println("Segunda-feira: ");
			break;

		case QUARTA: 
			System.out.println("Quarta-Feira: ");
			break;

		case QUINTA: 
			System.out.println("Quinta-Feira: ");
			break;

		case SEXTA: 
			System.out.println("Sexta-Feira: ");
			break;

		case SABADO: 
			System.out.println("Sabado: ");
			break;

		case DOMINGO: 
			System.out.println("Domingo: ");
			break;
		 }
	}
}