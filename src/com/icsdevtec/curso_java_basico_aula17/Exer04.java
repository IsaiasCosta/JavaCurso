package com.icsdevtec.curso_java_basico_aula17;

import java.util.Scanner;

/*
 * 4. Supondo que a população de um país A seja da ordem de 80000 
	habitantes com uma taxa anual de crescimento de 3% e que a 
	população de B seja 200000 habitantes com uma taxa de crescimento 
	de 1.5%. Faça um programa que calcule e escreva o número de anos 
	necessários para que a população do país A ultrapasse */
public class Exer04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double taxaPopA=80000;
		double taxaPopB=200000;
		int contAno=0;
		
		while (taxaPopA<=taxaPopB) {

			 taxaPopA+=(taxaPopA/100)*3;
			 taxaPopB+=(taxaPopB/100)*1.5;
			
			contAno++;
			
			System.out.println("População A  " + taxaPopA);
			System.out.println("População B  " + taxaPopB);
			System.out.println("Tempo para a População A chegar a Poulação B sera de " + contAno +" Anos");
					
		}

	}

}
