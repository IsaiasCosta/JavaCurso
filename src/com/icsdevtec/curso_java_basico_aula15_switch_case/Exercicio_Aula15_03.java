package com.icsdevtec.curso_java_basico_aula15_switch_case;

import java.util.Scanner;

/*Faça um Programa que verifique se uma letra digitada é "F" ou "M".
 Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido*/
public class Exercicio_Aula15_03 {

	public static void main(String[] args) {
		Scanner verificar = new Scanner(System.in);
		System.out.println("Digite M ou F, e saiba o seu sexo ! ");
		char sexo=verificar.nextLine().charAt(0);
		if (sexo =='M' || sexo == 'm') {
			System.out.println("A letra " + sexo + " representa o sexo Masculino");
		}else if (sexo =='F' || sexo =='f') {
			System.out.println("A letra " + sexo + " representa o sexo Feminino");
		}else {
			System.out.println("A letra " + sexo + " não representa o nenhum sexo valido! ");
		}
	}

}
