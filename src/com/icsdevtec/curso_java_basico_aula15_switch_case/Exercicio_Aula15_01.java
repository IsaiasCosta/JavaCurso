package com.icsdevtec.curso_java_basico_aula15_switch_case;

import java.util.Scanner;

//Faça um Programa que peça dois números e imprima o maior deles

public class Exercicio_Aula15_01 {

	public static void main(String[] args) {
		
		Scanner imprima = new Scanner(System.in);
		 System.out.println("Digite o primeiro numero");	 
		 int valor1= imprima.nextInt();
		 System.out.println("Digite o segundo numero");	 
		 int valor2= imprima.nextInt();
		 
		 if (valor1>valor2) {
			System.out.println(" O  numero " +valor1+ " é maior que o numero  " + valor2 );
		}else if(valor2>valor1) {
			System.out.println(" O  numero " +valor2+ " é maior que o numero " + valor1 );
		}else {
			System.out.println(" O  numero " +valor1+ " é mesmo que o numero " + valor2 );
		}
		 
		
	}

}
