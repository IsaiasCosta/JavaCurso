/**
 * 
 */
package com.icsdevtec.curso_java_basico_aula17;

import java.util.Scanner;

/**
 * @author icsdevtec
 *
 */
public class Exer11 {

	/**
	 * 11.Altere o programa anterior para mostrar no final a soma dos números
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int soma=0;
		System.out.println("Entre com o 1º numero ");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o 2º numero ");
		int num2 = scan.nextInt();
		for (int i = num1; i <= num2; i++) {
			 soma+=soma=i;
         System.out.println("Numeros gerados ==> " + i + " Soma ==> " + soma );

		}

	}

}
