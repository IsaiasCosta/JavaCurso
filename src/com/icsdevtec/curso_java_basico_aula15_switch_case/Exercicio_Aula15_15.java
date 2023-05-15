package com.icsdevtec.curso_java_basico_aula15_switch_case;

import java.util.Scanner;

/*15.Faça um Programa que peça os 3 lados de um triângulo. O programa
	deverá informar se os valores podem ser um triângulo. Indique, caso
	os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
	escaleno.
	o Dicas:
	o Três lados formam um triângulo quando a soma de quaisquer
	dois lados for maior que o terceiro;
	o Triângulo Equilátero: três lados iguais;
	o Triângulo Isósceles: quaisquer dois lados iguais;
	o Triângulo Escaleno: três lados diferentes;
*/
public class Exercicio_Aula15_15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o 1° lado do triangulo");
		int ladoA = scan.nextInt();
		System.out.println("Digite o 2° lado do triangulo");
		int ladoB = scan.nextInt();
		System.out.println("Digite o 3° lado do triangulo");
		int ladoC = scan.nextInt();
		if(((ladoA+ladoB)>ladoC)||(ladoA+ladoC)>ladoB ||(ladoB+ladoC)>ladoA) {
			
			if(ladoA==ladoB && ladoA==ladoC && ladoB==ladoC) {
				System.out.println("Triangulo Equilatero :");
				
			}else if (ladoA!=ladoB && ladoA!=ladoC && ladoC!=ladoB) {
				System.out.println("o Triângulo Escaleno:");
				
			}else if (ladoA==ladoB || ladoA==ladoC || ladoB==ladoC) {
				System.out.println("Triângulo Isósceles:");
			}
			
		}else {
			System.out.println("Não forma Triangulo");
		}
	}
}
	
