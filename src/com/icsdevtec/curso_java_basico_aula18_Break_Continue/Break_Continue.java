/**
 * 
 */
package com.icsdevtec.curso_java_basico_aula18_Break_Continue;

import java.util.Scanner;

/**
 * @author icsdevtec
 *
 */
public class Break_Continue {

	/**
	 * Break: o programa para quando entra a primeira resposta
	 * 
	 * Continue:Continua o loop na proxima iteração do bloco, continua sempre que
	 * tiver algo a ser execultado.
	 * 
	 * Label:
	 */
	public static void main(String[] args) {

		/*
		 * Scanner scan = new Scanner(System.in);
		 * System.out.println("Ente com um numero "); int num = scan.nextInt();
		 * System.out.println("Ente com um numero "); int max = scan.nextInt();
		 * 
		 * for (int i = num; i <= max; i++) { //System.out.println("" + i); if (i % 7 ==
		 * 0) { System.out.println(" Valor de I ==>"+ i); break;
		 * 
		 * }
		 * 
		 * }
		 */
		// Continue

		Scanner scan = new Scanner(System.in);
		System.out.println("Ente com um numero ");
		int num = scan.nextInt();
		System.out.println("Ente com um numero ");
		int max = scan.nextInt();

		for (int j = num; j <= max; j++) {

			if (j % 7 == 0) {
				continue;
			}
			System.out.println(" Valor de J ==>" + j);
		}

	}

}
