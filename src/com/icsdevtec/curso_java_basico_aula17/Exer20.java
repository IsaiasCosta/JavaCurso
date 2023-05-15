/**
 * 
 */
package com.icsdevtec.curso_java_basico_aula17;

import java.util.Scanner;

/**
 * @author icsdevtec
 *
 */
public class Exer20 {

	/**
	 * 20.Altere o programa de cálculo do fatorial, permitindo ao usuário calcular o
	 * fatorial várias vezes e limitando o fatorial a números inteiros positivos e
	 * menores que 16
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean validar = false;
		int cont=10;
		do {
			
			System.out.println("Entre com um numero inteiro ");
			int num = scan.nextInt();
			int fatorial = num;
			System.out.println("O fatorial de " + num + "!");
			cont++;
			if (num>0 && num <= 16) {
				validar = true;
				for (int i = num; i > 0; i--) {
					fatorial *= i;
					System.out.println(i + "!");
				}

			}

			System.out.println("Resultado : " + fatorial + "!");
		} while (!validar);

	}

}
