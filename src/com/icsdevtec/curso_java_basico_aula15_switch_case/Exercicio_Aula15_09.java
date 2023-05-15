package com.icsdevtec.curso_java_basico_aula15_switch_case;

import java.util.Scanner;

//9. Faça um Programa que leia três números e mostre-os em ordem decrescente.

public class Exercicio_Aula15_09 {

	public static void main(String[] args) {

   // 58 - 57 -56 -
		//58 - 56 - 57 
		
		//
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite  o 1º número ! ");
		int numero1=scan.nextInt();
		System.out.println("Digite  o 2º número ! ");
		int numero2=scan.nextInt();
		System.out.println("Digite  o 3º número ! ");
		int numero3=scan.nextInt();
		
		if (numero1>=numero2 && numero1>=numero3 ) {
			System.out.println("O número$ " +numero1+" é maior que o " +numero2+ " e o numero " +numero3 + " estão em ordem  decrescente !");
		}else if(numero1>=numero3 && numero3>=numero2 ) {
			System.out.println("O número @ " +numero1+" é maior que o " +numero3+ " e o numero " +numero2 + " estão em ordem  decrescente !");
		}else if(numero2>=numero1 && numero2>=numero3 ) {
			System.out.println("O número /" +numero2+" é maior que o " +numero1+ " e o numero " +numero3 + " estão em ordem  decrescente !");
		}else if(numero2>=numero3 && numero2>=numero1 ) {
			System.out.println("O número + " +numero2+" é maior que o " +numero3+ " e o numero " +numero1 + " estão em ordem  decrescente !");
		}else if(numero3>=numero2 && numero3>=numero1 ) {
			System.out.println("O número * " +numero3+" é maior que o " +numero2+ " e o numero " +numero1 + " estão em ordem  decrescente !");
		}else if(numero3>=numero1 && numero3>=numero2 && numero2>=numero1) {
			System.out.println("O número - " +numero3+" é maior que o " +numero2+ " e o numero " +numero1 + " estão em ordem  decrescente !");
		}
	}

}
