package com.icsdevtec.curso_java_basico_aula17;

import java.util.Scanner;

/* Faça um programa que peça uma nota, entre zero e dez. Mostre uma 
	mensagem caso o valor seja inválido e continue pedindo até que o 
	usuário informe um valor válido.
 * */

public class Exer01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean notaValida=false;
		do {
			System.out.println(" Entre com uma nota de 0 a 10 !!!");
			double nota= scan.nextDouble();
	
			if(nota <=10) {
				notaValida=true;
				System.out.println("Nota invalida");
			}else {
				System.out.println(" Nota do aluno " + nota);
			}
		}while(!notaValida);
		
		

	}

}
