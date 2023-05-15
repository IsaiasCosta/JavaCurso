/**
 * 
 */
package com.icsdevtec.curso_java_basico_aula17;

import java.util.Scanner;

/**
 * @author icsdevtec
 *
 */
public class Exer15 {

	/**
	 * 15.A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,...
	 * Faça um programa capaz de gerar a série até o n−ésimo termo
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o numero que ira gerar a serie de fibonacci");
		int fibo = scan.nextInt();

		int fibo1 = 1;
		int fibo2 = 1;
		int aux;
		
		for (int i = 3; i < fibo; i++) {

			aux = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = aux;

			System.out.println(" fibonacci  " + aux);
		}
	}

}
