package com.icsdevtec.curso_java_basico_aula17;

import java.util.Scanner;

/*
 * 12.Desenvolva um gerador de tabuada, capaz de gerar a tabuada de 
	qualquer número inteiro entre 1 a 10. O usuário deve informar de qual 
	numero ele deseja ver a tabuada. A saída deve ser conforme o 
	exemplo abaixo:
	o Tabuada de 5: 
	o 5 X 1 = 5 
	o 5 X 2 = 10 
	o ... 
	o 5 X 10 = 50
 */

public class Exer12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int mul = 1;
		int result = 0;
		System.out.println("Entre com um nº inteiro ");
		int num = scan.nextInt();
		System.out.println("Tabuada de " + num);
		for (int i = num; mul <= 10; mul++) {

			result = num * mul;

			System.out.println(" " + num + " X " + mul + " = " + result);

		}

	}

}
