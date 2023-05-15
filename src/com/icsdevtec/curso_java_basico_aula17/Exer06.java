package com.icsdevtec.curso_java_basico_aula17;

import java.util.Iterator;

/*
 * 6. Faça um programa que imprima na tela os números de 1 a 20, um 
	abaixo do outro. Depois modifique o programa para que ele mostre os 
	números um ao lado do outro
 * */
public class Exer06 {

	public static void main(String[] args) {
		 
		for (int num=1;num <=20;num++) {
			
			System.out.println("Nº " + num +" ");
			//System.out.print(" Nº " + num);
			
		}
		 
		for (int num=1;num <=20;num++) {
			
			//System.out.println("Nº " + num +" ");
			System.out.print("Nº" + num +" ");
			
		}

	}

}
