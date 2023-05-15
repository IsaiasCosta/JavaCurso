package com.icsdevtec.curso_java_basico_aula15_switch_case;

import java.util.Scanner;

/*
 * 22.Faça um Programa que peça um número inteiro e determine se ele é
	par ou impar. Dica: utilize o operador módulo (resto da divisão).*/
public class Exercicio_Aula15_22 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um valor inteiro !!!");
		int valor = scan.nextInt();
		if(valor%2==0) {
			System.out.println("Número Par");
		}else {
			System.out.println("Número Impar");
		}
		

	}
}
