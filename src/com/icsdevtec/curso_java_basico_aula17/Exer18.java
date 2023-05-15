/**
 * 
 */
package com.icsdevtec.curso_java_basico_aula17;

import java.util.Scanner;

/**
 * @author icsdevtec
 *
 */
public class Exer18 {

	/**
	 * 18.Faça um programa que, dado um conjunto de N números, determine o menor
	 * valor, o maior valor e a soma dos valores
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double numMaior = 0;
		double numMenor = 0;
		double soma = 0;
		for (int i = 0; i <= 10; i++) {
			System.out.println("Entre com um numero inteiro ");
			double num = scan.nextInt();
			if (num > numMaior) {
				numMaior = num;
			}
			if (num < numMaior) {
				numMenor = num;
			}
			soma += numMaior + numMenor;
			System.out.println("Maior numero : " + numMaior);
			System.out.println("Menor Numero : " + numMenor);
			System.out.println(" A soma dos numeros " + numMaior + " + " + numMenor + " = " + soma);

		}

	}

}
