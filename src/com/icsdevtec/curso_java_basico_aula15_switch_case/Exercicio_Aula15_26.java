package com.icsdevtec.curso_java_basico_aula15_switch_case;

import java.util.Scanner;
import java.text.DecimalFormat;

/*
 * Um posto está vendendo combustíveis com a seguinte tabela de descontos:
	. Álcool:
	
	a. até 20 litros, desconto de 3% por litro
	b. acima de 20 litros, desconto de 5% por litro
	
	Gasolina:
	
	c. até 20 litros, desconto de 4% por litro
	d. acima de 20 litros, desconto de 6% por litro Escreva um  algoritmo que leia
	o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: 
	 A-álcool, Ggasolina), calcule e imprima o valor a ser pago pelo cliente
	sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço
	do litro do álcool é R$ 1,90.
 * */
public class Exercicio_Aula15_26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual a quantidade de combustivel esta abastecendo ?");
		double litro = scan.nextInt();

		System.out.println("Informe qual o combustivel esta abastecendo [1] Álcool -[2]Gasolina ");
		int combustivel = scan.nextInt();
		double alcool = 1.90;
		double gasolina = 2.50;
		double valorPag = 0;
		double litroDes = 0;
		switch (combustivel) {
		case 1: {
			if (litro <= 20) {
				litroDes = ((alcool - (alcool * 0.03)));
				valorPag = litro * litroDes;

				System.out.println(
						"Valor de Desconto por Litro R$" + litroDes + " Valor ser pago pelo cliente R$ " + valorPag);

				break;
			}
			if (litro > 20) {
				litroDes = ((alcool - (alcool * 0.05)));
				valorPag = litro * litroDes;
				System.out.println(
						"Valor de Desconto por Litro R$" + litroDes + " Valor ser pago pelo cliente R$ " + valorPag);
				break;
			}

		}
		case 2: {
			if (litro <= 20) {
				litroDes = ((gasolina - (gasolina * 0.04)));
				valorPag = litro * litroDes;

				System.out.println(
						"Valor de Desconto por Litro R$" + litroDes + " Valor ser pago pelo cliente R$ " + valorPag);

				break;
			}
			if (litro > 20) {
				litroDes = ((gasolina - (gasolina * 0.06)));
				valorPag = litro * litroDes;
				System.out.println(
						"Valor de Desconto por Litro R$" + litroDes + " Valor ser pago pelo cliente R$ " + valorPag);
				break;
			}

		}
		
		}
	}

}
