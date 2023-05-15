package com.icsdevtec.curso_java_basico_aula15_switch_case;

import java.util.Scanner;

/*
 * 23.Faça um Programa que peça um número e informe se o número é
	inteiro ou decimal. Dica: utilize uma função de arredondamento.
 * */
public class Exercicio_Aula15_23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero !!!");
		double numero = scan.nextDouble();
		if(numero%1==0) {
			System.out.println("Número Inteiro " + numero);
		}else {
			System.out.println("Número Decimal " + numero);
		}

	}

}
