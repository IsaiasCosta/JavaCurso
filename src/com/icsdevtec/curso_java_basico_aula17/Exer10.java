/**
 * 
 */
package com.icsdevtec.curso_java_basico_aula17;

import java.util.Scanner;

/**
 * @author icsdevtec
 *
 */
public class Exer10 {

	/**
	 * 
	 * 10.Faça um programa que receba dois números inteiros e gere os números
	 * inteiros que estão no intervalo compreendido por eles.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o 1º numero ");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o 2º numero ");
		int num2 = scan.nextInt();
		for (int i = num1; i <= num2; i++) {
         System.out.println(" numeros gerados " + i);
		}

	}

}
