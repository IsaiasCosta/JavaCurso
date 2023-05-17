/**
 * 
 */
package com.icsdevtec.curso_java_basico_aula19;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author icsdevtec
 *
 */
public class Exer12_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com os elementos do vetor " + i + " = > ");
			vetorA[i] = scan.nextInt(); 
			vetorA[i] =+ vetorA[i] ;		
		}
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Soma de todos os elementosd do Vetor A " + vetorA[i]);
		}

	}

}
