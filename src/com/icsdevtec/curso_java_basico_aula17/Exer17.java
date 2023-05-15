/**
 * 
 */
package com.icsdevtec.curso_java_basico_aula17;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author icsdevtec
 *
 */
public class Exer17 {

	/**
	 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo
	 * usuário. Ex.: 5!=5.4.3.2.1=120
	 */
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		
		System.out.println("Entre com um numero inteiro ");
		int num =  scan.nextInt();
		int fatorial=num;
		System.out.println("O fatorial de "+ num +"!");
		for (int i = num; i>0; i--) {
			 fatorial*=i;
			
			
			System.out.println(  i+"!");
		}
		
		System.out.println("Resultado : "+fatorial+"!");
		
		
	}

}
