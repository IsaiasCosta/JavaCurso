/**
 * 
 */
package com.icsdevtec.curso_java_basico_aula20;

import java.util.Random;

/**
 * @author icsdevtec
 *
 */
public class Exer_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] numeroAleatorios = new int[10][10];

		Random NumRedom = new Random();

		for (int i = 0; i < numeroAleatorios.length; i++) {
			for (int j = 0; j < numeroAleatorios[i].length; j++) {

				numeroAleatorios[i][j] = NumRedom.nextInt(1,100);

			}
		}
		for (int i = 0; i < numeroAleatorios.length; i++) {
			for (int j = 0; j < numeroAleatorios[i].length; j++) {
				System.out.print(numeroAleatorios[i][j] + "|");
			}
			System.out.println( );
		}
		int maiorLin5 = 0;
		int menorLin5 = Integer.MAX_VALUE;
		int linha5 = 5;

		int menorCol7 = Integer.MAX_VALUE;
		int maiorCol7 = 0;
		int coluna7 = 7;

		int coluna = 0;
		int linha = 0;
		for (int i = 0; i < numeroAleatorios[linha5].length; i++) {
			if (numeroAleatorios[linha5][i] > maiorLin5) {
				maiorLin5 = numeroAleatorios[linha5][i];

			}
			if (numeroAleatorios[linha5][i] < menorLin5) {
				menorLin5 = numeroAleatorios[linha5][i];

			}

		}

		System.out.println("Maior Linha 5 =  " + maiorLin5);
		System.out.println("Menor Linha 5 =  " + menorLin5);

		for (int i = 0; i < numeroAleatorios.length; i++) {
			if (numeroAleatorios[i][coluna7] > maiorCol7) {
				maiorCol7 = numeroAleatorios[i][coluna7];

			}
			if (numeroAleatorios[i][coluna7] < menorCol7) {
				menorCol7 = numeroAleatorios[i][coluna7];

			}
		}
		System.out.println("Maior Coluna 7 = " + maiorCol7);
		System.out.println("Menor Coluna 7 = " + menorCol7);
	}
}
