/**
 * 
 */
package com.icsdevtec.curso_java_basico_aula17;

import java.util.Scanner;

/**
 * @author icsdevtec
 *
 */
public class Exer19 {

	/**
	 * 19.Altere o programa anterior para que ele aceite apenas números entre 0 e
	 * 1000.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double numMaior = 0;
		double numMenor = 0;
		double soma = 0;
		
		for (int i = 0; i <= 10; i++) {
			System.out.print("Entre com um numero maior que 0 e menor que  100 ==> nº " );
			double  num = scan.nextInt();
			if (num <= 100 && num > 0) {
				if (num > numMaior) {
					numMaior = num;
				} 
			}
			if (num <= 100 && num > 0) {
				if (num < numMaior) {
					numMenor = num;
				} 
			}
			soma += numMaior + numMenor;
			System.out.println("Maior numero : " + numMaior);
			System.out.println("Menor Numero : " + numMenor);
			System.out.println("A soma dos numeros " + numMaior + " + " + numMenor + " = " + soma);

		}
	}
}
