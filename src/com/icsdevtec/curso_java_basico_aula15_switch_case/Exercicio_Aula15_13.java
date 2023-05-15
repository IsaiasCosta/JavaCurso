package com.icsdevtec.curso_java_basico_aula15_switch_case;

import java.util.Scanner;

/*13.Faça um Programa que leia um número e exiba o dia correspondente
  da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
  aparecer valor inválido
 */

public class Exercicio_Aula15_13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número para exbir o dia da semana - [1] Domingo -[2] Segunda - feira"
			+"[3] Terça-feira - [4] Quarta-feira -[5] Quinta-feira - [6] Sexta-feira - [7] Sábado ");
		int dia = scan.nextInt();
		switch (dia) {
		case 1: {
			System.out.println("O  número informado " +dia+" Corresponde a Domingo");break;
		}
		case 2: {
			System.out.println("O  número informado " +dia+" Corresponde a Segunda-Feira");break;
		}
		case 3: {
			System.out.println("O  número informado " +dia+" Corresponde a Terça-Feira");break;
		}case 4: {
			System.out.println("O  número informado " +dia+" Corresponde a Quarta-Feira");break;
		}case 5: {
			System.out.println("O  número informado " +dia+" Corresponde a Quinta-Feira");break;
		}case 6: {
			System.out.println("O  número informado " +dia+" Corresponde a Sexta-Feira");break;
		}case 7: {
			System.out.println("O  número informado " +dia+" Corresponde a Sábado");break;
		}
		default:
			System.out.println("O  valor informado " + dia + " Não corresponde para um dia semana");
		}

	}

}
