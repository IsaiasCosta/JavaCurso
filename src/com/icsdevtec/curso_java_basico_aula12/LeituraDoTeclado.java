package com.icsdevtec.curso_java_basico_aula12;

import java.util.Scanner;

public class LeituraDoTeclado {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in); 
		
		System.out.println("Informe o seu nome completo " );
		String nomeCompleto = scan.nextLine();
		
		System.out.println("Seu nome completo é " + nomeCompleto);

	}

}
