package com.icsdevtec.curso_java_basico_aula15_switch_case;

import java.util.Scanner;

/*
 * 24.Faça um Programa que leia 2 números e em seguida pergunte ao
	usuário qual operação ele deseja realizar. O resultado da operação
	deve ser acompanhado de uma frase que diga se o número é:
	. par ou ímpar;
	a. positivo ou negativo;
	b. inteiro ou decimal.
 * */
public class Exercicio_Aula15_24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o 1º número !!!");
		double numero1 = scan.nextDouble();
		System.out.println("Digite o 2º número !!!");
		double numero2 = scan.nextDouble();

		System.out.println(
				"Escolha qual operação que realizar [1] Par ou Impar - [2] Positivo ou Negativo [3] Inteiro ou Decimal.");
		int operacao = scan.nextInt();
		switch (operacao) {
		case 1: {
			if (numero1 % 2 == 0) {
				System.out.println("O número informado é " + numero1 + " Par ");
			}
			if (numero2 % 2 == 0) {
				System.out.println("O número informado é " + numero2 + " Par ");
			}
			if (numero1 % 2 == 1) {
				System.out.println("O número informado é " + numero1 + " Impar");
			}
			if (numero2 % 2 == 1) {
				System.out.println("O número informado é " + numero2 + " Impar");
			}
			break;
		}
		case 2: {
			if (numero1 >= 0) {
				System.out.println("O número informado é " + numero1 + " Positivo ");
			}
			if (numero2 >= 0) {
				System.out.println("O número informado é " + numero2 + " Positivo ");
			}
			if (numero1 < 0) {
				System.out.println("O número informado é " + numero1 + " Negativo");
			}
			if (numero2 < 0) {
				System.out.println("O número informado é " + numero2 + " Negativo");
			}
			break;
		}
		case 3: {
			if (numero1 % 1 == 0) {
				System.out.println("O número informado é " + numero1 + " Inteiro ");
			} else {
				System.out.println("O número informado é " + numero1 + " Decimal");
			}
			if (numero2 % 1 == 0) {
				System.out.println("O número informado é " + numero2 + " Inteiro ");
			} else {
				System.out.println("O número informado é " + numero2 + " Decimal");
			}
			break;
		}

		}

	}

}
