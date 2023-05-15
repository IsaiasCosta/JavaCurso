package com.icsdevtec.curso_java_basico_aula15_switch_case;

import java.util.Scanner;

/*17.Faça um Programa que peça um número correspondente a um
 determinado ano e em seguida informe se este ano é ou não bissexto.
 */
public class Exercicio_Aula15_17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite qual ano composto de 4 digitos !!!");
		int ano = scan.nextInt();
		
		if(ano%4==0 ||ano %400==0 && ano%100 != 0) {
			System.out.println("O ano informado é Bissexto " + ano);
		}else {

			System.out.println("O ano informado Não é Bissexto " + ano);
		}
		

	}

}
