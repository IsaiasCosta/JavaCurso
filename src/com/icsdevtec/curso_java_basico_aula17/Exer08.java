/**
 * 
 */
package com.icsdevtec.curso_java_basico_aula17;

import java.util.Scanner;

/**
 * @author icsdevtec
 *
 */
public class Exer08 {

	/**
	 * 8. Faça um programa que leia 5 números e informe a soma e a média dos
	 * números.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double num;
		double media;
		double soma = 0;
		for (int i = 0; i <= 5; i++) {
			System.out.println("Entre com o  número inteiro");
			num = scan.nextInt();
			soma += num;
			media = soma / 5;
			System.out.println("A soma dos é numero " + soma);
			System.out.println("A  média dos  numero " + media);
		}

	}

}
