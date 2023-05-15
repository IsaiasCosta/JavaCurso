/**
 * 
 */
package com.icsdevtec.curso_java_basico_aula17;

import java.util.Scanner;

/**
 * @author icsdevtec
 *
 */
public class Exer14 {

	/**
	 * 14.Faça um programa que peça 10 números inteiros, calcule e mostre a
	 * quantidade de números pares e a quantidade de números impares
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num=0;
		int par =0;
		int impar=0;
		for (int i = 0; i <= 10; i++) {
			
			System.out.println("Entre  com os valores ");
			num=scan.nextInt();
			if (num%2==0) {
				par++;
				
			}else {
				impar++;
			}
			
		}
		System.out.println(" Quantidade de numeros Pares  " + par );
		System.out.println(" Quantidade de numeros Impares " + impar);
		
	}

}
