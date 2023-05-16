/**
 * 
 */
package com.icsdevtec.curso_java_basico_aula19;

import java.util.Scanner;

/**
 * @author icsdevtec
 *
 */
public class Exer05_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(" Entre com o valores do vetor A " + i);
			vetorA[i] = scan.nextInt();

			vetorB[i] = vetorA[i] * i;
			
		}
		System.out.println();
		System.out.println("-------- Vetor A -------- ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Vetor A  " + vetorA[i] );
		}
		System.out.println();
		System.out.println("-------- Vetor B --------  ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("VetorB  " + vetorB[i] );
		}

	}

}
