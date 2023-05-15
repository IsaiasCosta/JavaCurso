package com.icsdevtec.curso_java_basico_aula15_switch_case;

import java.util.Scanner;

/* 16.Faça um programa que calcule as raízes de uma equação do segundo
	grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a,
	b e c e fazer as consistências, informando ao usuário nas seguintes
	situações:
	a. Se o usuário informar o valor de A igual a zero, a equação não é
	do segundo grau e o programa não deve fazer pedir os demais
	valores, sendo encerrado;
	b. Se o delta calculado for negativo, a equação não possui raizes
	reais. Informe ao usuário e encerre o programa;
	c. Se o delta calculado for igual a zero a equação possui apenas
	uma raiz real; informe-a ao usuário;
	d. Se o delta for positivo, a equação possui duas raiz reais;
	informe-as ao usuário;*/

public class Exercicio_Aula15_16 {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Digite a valor da A => ");
		int valorA = scan.nextInt();
		if(valorA ==0) {
			System.out.println("A equação não é	de segundo grau");
		}
		System.out.println("Digite a valor da B => ");
		int valorB = scan.nextInt();
		
		System.out.println("Digite a valor da C => ");
		int valorC = scan.nextInt();
		
		double delta = (valorB * valorB)-(4*valorA*valorC);
		if(delta<0) {
			System.out.println("A equação Negativa não possui Raiz");
		}else {
			System.out.println("Valor de Delta " + delta);
			double x1 = ((-valorB)+Math.sqrt(delta)) / (2*valorA);
			double x2 = ((-valorB)-Math.sqrt(delta)) / (2*valorA);
			System.out.println("x1 => " + x1);
			System.out.println("x2 => " + x2);
		}
		
	}

}
