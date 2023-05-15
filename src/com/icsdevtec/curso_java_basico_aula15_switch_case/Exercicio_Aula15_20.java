package com.icsdevtec.curso_java_basico_aula15_switch_case;

import java.util.Scanner;

/*
 * 20.Faça um Programa para leitura de três notas parciais de um aluno. O
	programa deve calcular a média alcançada por aluno e presentar:
	. A mensagem "Aprovado", se a média for maior ou igual a 7,
	com a respectiva média alcançada;
	a. A mensagem "Reprovado", se a média for menor do que 7, com
	a respectiva média alcançada;
	b. A mensagem "Aprovado com Distinção", se a média for igual a 10.
 */

public class Exercicio_Aula15_20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com a 1º nota ");
		double nota1 = scan.nextDouble();
		System.out.println("Entre com a 2º nota ");
		double nota2 = scan.nextDouble();
		System.out.println("Entre com a 3º nota ");
		double nota3 = scan.nextDouble();

		double media = (nota1 + nota2 + nota3) / 3;
		if (media >= 7){
			System.out.println("Media alcançada " + media + " Aprovado ");
		}
		if(media<=6.999){
			System.out.println("Media alcançada " + media + " Reprovado ");
		}
		if(media==10) {
			System.out.println("Media alcançada " + media + " Aprovado com Distinção ");
		}
	}

}
