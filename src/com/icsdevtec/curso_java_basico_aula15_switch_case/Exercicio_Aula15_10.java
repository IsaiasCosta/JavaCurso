package com.icsdevtec.curso_java_basico_aula15_switch_case;

import java.util.Scanner;

public class Exercicio_Aula15_10 {
	/*10.Faça um Programa que pergunte em que turno você estuda. Peça
	para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
	mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
	Inválido!", conforme o caso*/
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual turno você estuda? [M ou m] matutino - [V ou v] Vespertino - [N ou n] Noturno");
		
		char turnoEstudo = scan.nextLine().charAt(0);
		switch (turnoEstudo) {
		case 'M': {
			System.out.println("Bom Dia! " +turnoEstudo+ " foi a sua escolha, você é do turno Matutino");
            break;
		}
		case 'm': {
			System.out.println("Bom Dia! " +turnoEstudo+ " foi a sua escolha, você é do turno Matutino");
            break;
		}
		case 'V': {
			System.out.println("Boa Tarde! " +turnoEstudo+ " foi a sua escolha, você é do turno Vespertino");
            break;
		}
		case 'v': {
			System.out.println("Boa Tarde! " +turnoEstudo+ " foi a sua escolha, você é do turno Vespertino");
            break;
		}
		case 'N': {
			System.out.println("Boa Tarde! " +turnoEstudo+ " foi a sua escolha, você é do turno Noturno");
            break;
		}
		case 'n': {
			System.out.println("Boa Tarde! " +turnoEstudo+ " foi a sua escolha, você é do turno Noturno");
            break;
		}
		default:
		System.out.println(" Essa informação não pertence a nenhum turno");
		}

	}

}
