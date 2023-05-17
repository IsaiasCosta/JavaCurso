/**
 * 
 */
package com.icsdevtec.curso_java_basico_aula19;

import java.util.Scanner;

/**
 * @author icsdevtec
 *
 */
public class Exer11_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		int par = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("entre com os valores " + i+ " = > " );
			vetorA[i] = scan.nextInt();
			if (vetorA[i] % 2 == 0) {
				par++;
			}
		}
		System.out.println("Quantidade de elementos pares " + par);
	}

}
