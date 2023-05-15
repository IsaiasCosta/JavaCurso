package com.icsdevtec.curso_java_basico_aula15_switch_case;

import java.util.Scanner;

//Faça um Programa que verifique se uma letra digitada é vogal ou consoante

public class Exercicio_Aula15_04 {

	 public static void main(String[]args) {
		
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Digite uma letra ! ");
		 
		 char letra = scan.nextLine().charAt(0);
		 if (letra =='a' ||letra =='A') {
			System.out.println("A letra " +letra+ " é uma vogal" );
		}else if (letra =='e' ||letra =='E') {
			System.out.println("A letra " +letra+ " é uma vogal" );
		}else if (letra =='i' ||letra =='I') {
			System.out.println("A letra " +letra+ " é uma vogal" );
		}else if (letra =='o' ||letra =='O') {
			System.out.println("A letra " +letra+ " é uma vogal" );
		}else if (letra =='u' ||letra =='U') {
			System.out.println("A letra " +letra+ " é uma vogal" );
		}else {
			System.out.println("A letra " +letra+ " é uma consoante");
		}	
		 				 
	}
}
