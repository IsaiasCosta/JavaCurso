/**
 * 
 */
package com.icsdevtec.curso_java_basico_aula19;

import java.util.Scanner;

/**
 * @author icsdevtec
 *
 */
public class Exer08_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[10];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.print("Entre com os respectivos valores do vetor A : " );
			vetorA[i] = scan.nextInt();
		}
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("Entre com os  respectivos valores do vetor B : " );
			vetorB[i] = scan.nextInt();
		}
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] * vetorB[i];

			System.out.println("Multiplicação dos vetores " + vetorA[i] + " * " +vetorB[i] + " = "+ vetorC[i]);
		}


	}

}
