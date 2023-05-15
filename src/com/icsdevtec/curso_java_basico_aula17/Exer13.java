/**
 * 
 */
package com.icsdevtec.curso_java_basico_aula17;

import java.util.Scanner;

/**
 * @author icsdevtec
 *
 */
public class Exer13 {

	/**
	 *13.Faça um programa que peça dois números, base e expoente, calcule e 
		mostre o primeiro número elevado ao segundo número. Não utilize a 
		função de potência da linguagem.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int resultado=1;
		System.out.println("Entre com o 1º Nº");
		int base=scan.nextInt();
		System.out.println("Entre com o 2º Nº");
		int expoente=scan.nextInt();
		for(int i=1;i<=expoente;i++){
			resultado*=base;
		}
		
		System.out.println("Resultado da elevação da base " + base + " ^ " + expoente + " = " + resultado + "  " );

	}

}
