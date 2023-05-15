/**
 * 
 */
package com.icsdevtec.curso_java_basico_aula17;

import java.util.Scanner;

/**
 * @author icsdevtec
 *
 */
public class Exer16 {

	/**
	 * 16.A série de Fibonacci é formada pela seqüência
	 * 0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até que o
	 * valor seja maior que 500.
	 */
	public static void main(String[] args) {

		 System.out.println("Gerando fibonacci até chegar em 500 ");
		int fibo1 = 1;
		int fibo2 = 1;
		int aux = 0;

		while (aux < 500) {
			aux++;
			aux = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = aux;

			System.out.println(" fibonacci  " + aux);
		}

	}

}
