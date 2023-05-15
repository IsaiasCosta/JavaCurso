package com.icsdevtec.curso_java_basico_aula15_switch_case;

import java.util.Scanner;

/*14.Faça um programa que lê as duas notas parciais obtidas por um aluno
	numa disciplina ao longo de um semestre, e calcule a sua média. A
	atribuição de conceitos obedece à tabela abaixo:
	o Média de Aproveitamento Conceito
	o Entre 9.0 e 10.0 A
	o Entre 7.5 e 9.0 B
	o Entre 6.0 e 7.5 C
	o Entre 4.0 e 6.0 D
	o Entre 4.0 e zero E*/

public class Exercicio_Aula15_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a 1° nota do Aluno");
		double nota1 =  scan.nextDouble();
		System.out.println("Digite a 2° nota do Aluno");
		double nota2 =  scan.nextDouble();
		
		Double media = (nota1*nota2)/2;
		if (media >9.0 && media <= 10.0) {
			System.out.println("A Média de Aproveitamento " +media+ " tem Conceito A - APROVADO " );
		}else if (media > 7.5 && media <=9.0) {
			System.out.println("A Média de Aproveitamento " +media+ " tem Conceito B - APROVADO" );
		} else if(media >=6.0 && media <=7.5){
			System.out.println("A Média de Aproveitamento " +media+ " tem Conceito C - APROVADO" );
		}else if(media >4.0 && media <6.0){
			System.out.println("A Média de Aproveitamento " +media+ " tem Conceito D - REPROVADO" );
		}else if(media <=4.0) {
			System.out.println("A Média de Aproveitamento " +media+ " tem Conceito E - REPROVADO" );
		}
		

	}

}
