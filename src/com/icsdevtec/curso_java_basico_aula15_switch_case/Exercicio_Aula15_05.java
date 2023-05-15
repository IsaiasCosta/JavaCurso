package com.icsdevtec.curso_java_basico_aula15_switch_case;

import java.util.Scanner;

/*Faça um programa para a leitura de duas notas parciais de um aluno.
 O programa deve calcular a média alcançada por aluno e apresentar:
 o A mensagem "Aprovado", se a média alcançada for maior ou
 igual a sete;
 o A mensagem "Reprovado", se a média for menor do que sete;
 o A mensagem "Aprovado com Distinção", se a média for igual a
 dez.*/

public class Exercicio_Aula15_05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Informa 1º nota do aluno !");
		double nota1 = scan.nextDouble();
		System.out.println("Informa 2º nota do aluno !");
		double nota2 = scan.nextDouble();
		double media = (nota1+nota2)/2;
		if (media<=7) {
			System.out.println(" O Aluno tirou nota " +media+ " esta Reprovado");
		}else {
			System.out.println(" O Aluno tirou nota " +media+ " esta Aprovado com Distinção");
		}
		
			
	}

}
