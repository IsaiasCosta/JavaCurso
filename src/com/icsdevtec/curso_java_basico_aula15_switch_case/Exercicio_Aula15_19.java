package com.icsdevtec.curso_java_basico_aula15_switch_case;

import java.util.Scanner;

/*
 * .Faça um Programa que leia um número inteiro menor que 1000 e
	imprima a quantidade de centenas, dezenas e unidades do mesmo.
	o Observando os termos no plural a colocação do "e", da vírgula
	entre outros. Exemplo:
	o 326 = 3 centenas, 2 dezenas e 6 unidades
	o 12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320,
	310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16
 */
public class Exercicio_Aula15_19 {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.println("Digite um número menor que 1000");
		int numero = scan.nextInt();
			 int centena = numero/100;
			 int dezena =(numero%100)/10;
			 int unidade = ((numero%100)%10);
			 System.out.println("Colocação > = "+centena+" centenas," + dezena+ " dezenas e "+unidade+" unidade");
		

	}

}
