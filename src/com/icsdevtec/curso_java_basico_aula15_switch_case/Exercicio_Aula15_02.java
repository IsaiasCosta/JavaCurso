package com.icsdevtec.curso_java_basico_aula15_switch_case;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

//Faça um Programa que peça um valor e mostre na tela se o valor é
//positivo ou negativo.

public class Exercicio_Aula15_02 {

	public static void main(String[] args) {
		Scanner mostre = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		double valor=mostre.nextDouble();
		if (valor>=0) {
			System.out.println(" O numero informado " +valor+ " é positivo");
		}else  {
			System.out.println(" O numero informado " +valor+ " é negativo ");
		}
				
	}

}
