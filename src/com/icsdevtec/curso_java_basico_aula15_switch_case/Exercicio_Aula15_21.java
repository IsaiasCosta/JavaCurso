package com.icsdevtec.curso_java_basico_aula15_switch_case;

import java.util.Scanner;

/*
 	* 21.Faça um Programa para um caixa eletrônico. O programa deverá
	perguntar ao usuário a valor do saque e depois informar quantas notas
	de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5,
	10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600
	reais. O programa não deve se preocupar com a quantidade de notas
	existentes na máquina.
	. Exemplo 1: Para sacar a quantia de 256 reais, o programa
	fornece duas notas de 100, uma nota de 50, uma nota de 5 e
	uma nota de 1;
	a. Exemplo 2: Para sacar a quantia de 399 reais, o programa
	fornece três notas de 100, uma nota de 50, quatro notas de 10,
	uma nota de 5 e quatro notas de 1.
 */
public class Exercicio_Aula15_21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor a ser sacado do caixa !!!");
		int saque = scan.nextInt();
		int notas100 = 100;
		int notas50 = 50;
		int notas20 = 20;
		int notas10 = 10;
		int notas5 = 5;
		int notas1 = 1;
		if (saque >= 100) {
			if (notas100 > 0) {
				notas100 = saque / 100;
				saque = saque % 100;
			}
			if (notas50 > 0) {
				notas50 = saque / 50;
				saque = saque % 50;
			}
			if (notas20 > 0) {
				notas20 = saque / 20;
				saque = saque % 20;
			}
			if (notas10 > 0) {
				notas10 = saque / 10;
				saque = saque % 10;
			}
			if (notas5 > 0) {
				notas5 = saque / 5;
				saque = saque % 5;
			}
			if (notas1 > 0) {
				notas1 = saque / 1;
				saque = saque % 1;
			}

		}
		System.out.println(" Notas de R$ 100 ==> " + notas100);
		System.out.println(" Notas de R$50 ==>  " + notas50);
		System.out.println(" Notas de R$20 ==>  " + notas20);
		System.out.println(" Notas de R$10 ==>  " + notas10);
		System.out.println(" Notas de R$05 ==>  " + notas5);
		System.out.println(" Notas de R$1  ==>  " + notas1);
	}
}
