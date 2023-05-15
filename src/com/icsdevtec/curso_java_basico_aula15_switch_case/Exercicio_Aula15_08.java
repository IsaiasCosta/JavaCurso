package com.icsdevtec.curso_java_basico_aula15_switch_case;

import java.util.Scanner;

/*8. Faça um programa que pergunte o preço de três produtos e informe
qual produto você deve comprar, sabendo que a decisão é sempre
pelo mais barato.*/

public class Exercicio_Aula15_08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o preço do  1º produto ! ");
		Double preco1 = scan.nextDouble();
		System.out.println("Informe o preço do  2º produto ! ");
		Double preco2 = scan.nextDouble();
		System.out.println("Informe o preço do   3º produto ! ");
		Double preco3 = scan.nextDouble();

		if (preco1 < preco2 && preco1 < preco3) {
			System.out.println("O preço R$ " + preco1 + " é menor que o R$" + preco2 + " e o preço R$ " + preco3 + " é melhor levar esse produto de R$ " +preco1);
		} else if (preco2 < preco1 && preco2 < preco3) {
			System.out.println("O preço R$ " + preco2 + " é menor que o  R$" + preco1 + " e o preço R$" + preco3 + " é melhor levar esse produto de R$" +preco2);
		} else if (preco3 < preco2 && preco3 < preco1) {
			System.out.println("O preço R$" + preco3 + " é menor que o R$" + preco2 + " e o preço  R$" + preco1 + " é melhor levar esse produto de R$" + preco3);
		}
	}

}
