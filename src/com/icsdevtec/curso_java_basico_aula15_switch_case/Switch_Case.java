package com.icsdevtec.curso_java_basico_aula15_switch_case;

import java.util.Scanner;

public class Switch_Case {

	// dai da semama de 1 a 7

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Escolha um de número de 1 a 7 e descubra o dia semana");

		int diaSemana = scan.nextInt();
		switch (diaSemana) {
		case 1: {

			System.out.println("O dia escolhido foi " + diaSemana + " representa a segunda - feira");
			break;
		}
		case 2: {

			System.out.println("O dia escolhido foi " + diaSemana + " representa a terça - feira");
			break;
		}
		case 3: {

			System.out.println("O dia escolhido foi " + diaSemana + " representa a quarta - feira");
			break;
		}
		case 4: {

			System.out.println("O dia escolhido foi " + diaSemana + " representa a quinta - feira");
			break;
		}
		case 5: {

			System.out.println("O dia escolhido foi " + diaSemana + " representa a sexta - feira");
			break;
		}
		case 6: {

			System.out.println("O dia escolhido foi " + diaSemana + " representa o sabado - feira");
			break;
		}
		case 7: {

			System.out.println("O dia escolhido foi " + diaSemana + " representa o domingo - feira");
			break;
		}
		default:
			System.out.println("Esse numero " + diaSemana+ " não representa um dia da semana");
		}
	}

}
