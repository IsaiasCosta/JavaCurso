package com.icsdevtec.curso_java_basico_aula15_switch_case;

import java.util.Scanner;

//7. Faça um Programa que leia três números e mostre o menor e o menor deles

public class Exercicio_Aula15_07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Ente com o 1º número ! ");
		int numero1 = scan.nextInt();
		System.out.println("Ente com o 2º número ! ");
		int numero2 = scan.nextInt();
		System.out.println("Ente com o 3º número ! ");
		int numero3 = scan.nextInt();

		if (numero1 < numero2 && numero1 < numero3) {
			System.out.println("O número " + numero1 + " é menor que o  " + numero2 + " e o numero " + numero3);
		} else if (numero2 < numero1 && numero2 < numero3) {
			System.out.println("O número " + numero2 + " é menor que o  " + numero1 + " e o numero " + numero3);
		} else if (numero3 < numero2 && numero3 < numero1) {
			System.out.println("O número " + numero3 + " é menor que o  " + numero2 + " e o numero " + numero1);
		}

	}

}
