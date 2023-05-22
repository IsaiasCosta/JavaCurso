/**
 * 
 */
package com.icsdevtec.curso_java_basico_aula20;

import java.util.Random;

/**
 * @author icsdevtec
 *
 */
public class Exer_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] numerosAleatorios = new int[4][4];
		Random numeroRandom = new Random();

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(200);
			}

		}
		int maior = 0;
		int linha = 0;
		int coluna = 0;
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				if (numerosAleatorios[i][i] > maior) {
					maior = numerosAleatorios[i][j];
					linha = i;
					coluna = j;

				}
			}
		}
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				System.out.println(numerosAleatorios[i][i] + " ");
			}
			System.out.println("================");
		}
		System.out.println("Maior nº Aleatorio " + maior);
		System.out.println("Nº da linha : " + linha);
		System.out.println("Nº da coluna :" + coluna);
	}

}
