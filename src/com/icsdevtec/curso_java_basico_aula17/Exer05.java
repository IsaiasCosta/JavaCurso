package com.icsdevtec.curso_java_basico_aula17;

/*
 * 5. 	Altere o programa anterior permitindo ao usuário informar as 
		populações e as taxas de crescimento iniciais. Valide a entrada e 
		permita repetir a operação.*/

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double taxaPopA, taxaPopB;
		double PopA, PopB;
		boolean validador = false;
		int contAno = 0;

		do {

			System.out.println("Informe a População de A");
			PopA = scan.nextDouble();
			if (PopA > 0) {
				validador = true;
			} else {
				System.out.println("População A não existe !");

			}

		} while (!validador);

		do {
			System.out.println("Informe a População de B");
			PopB = scan.nextDouble();
			if (PopB > 0) {
				validador = true;
			} else {
				System.out.println("População B não existe !");

			}
		} while (!validador);

		do {
			System.out.println("Informe a taxa de calculo para a População de A");
			taxaPopA = scan.nextDouble();
			if (taxaPopA > 0) {
				validador = true;
			} else {
				System.out.println("Informe uma taxa maior que ZERO !");

			}
		} while (!validador);

		do {
			System.out.println("Informe a taxa de calculo para a População de B");
			taxaPopB = scan.nextDouble();
			if (taxaPopB > 0) {
				validador = true;
			} else {
				System.out.println("Informe uma taxa maior que ZERO !");

			}
		} while (!validador);

		while (PopA <= PopB) {
			PopA += (PopA / 100) * taxaPopA;
			PopB += (PopB / 100) * taxaPopB;
			contAno++;

			System.out.println("População A: " + PopA);
			System.out.println("População B: " + PopB);
			System.out.println("Quantidade de Anos: " + contAno);
		}

	}

}
