/**
 * 
 */
package com.icsdevtec.curso_java_basico_aula17;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author icsdevtec
 *
 */
public class Exer07 {

	/**
	 * Faça um programa que leia 5 números e informe o maior número
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num;
		int maior = Integer.MIN_VALUE;
		for (int i = 0; i <= 5; i++){
			System.out.println("Entre com o  número inteiro");
			num = scan.nextInt();
			if(num>maior) {
				maior=num;
				
			}

		}
		System.out.println("o maior numero " + maior);
	}

}
