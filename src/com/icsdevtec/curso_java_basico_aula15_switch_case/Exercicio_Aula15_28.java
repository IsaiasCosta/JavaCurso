package com.icsdevtec.curso_java_basico_aula15_switch_case;

import java.util.Scanner;

/*
 *28.O Hipermercado Tabajara está com uma promoção de carnes que é 
	imperdível. Confira:
	o Até 5 Kg Acima de 5 Kg 
	o Acém 2,90         por 3,90
	o File Duplo R$ 4,90 por Kg R$ 5,80 por Kg 
	o Alcatra R$ 5,90 por Kg R$ 6,80 por Kg 
	o Picanha R$ 6,90 por Kg R$ 7,80 por Kg
	Para atender a todos os clientes, cada cliente poderá levar 
	apenas um dos tipos de carne da promoção, porém não há 
	limites para a quantidade de carne por cliente. Se compra for 
	feita no cartão Tabajara o cliente receberá ainda um desconto 
	de 5% sobre o totall a compra. Escreva um programa que peça 
	o tipo e a quantidade de carne comprada pelo usuário e gere 
	um cupom fiscal, contendo as informações da compra: tipo e 
	quantidade de carne, preço totall, tipo de pagamento, valor do 
	desconto e valor a pagar */

public class Exercicio_Aula15_28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escolha o tipo de Carne");
		System.out.println("[1] - Acém");
		System.out.println("[2] - File Duplo");
		System.out.println("[3] - Alcatra");
		System.out.println("[4] - Picanha");
		int tipoCarne = scan.nextInt();
		System.out.println("Informe quantos Kilos esta levando ");
		double precoAcem1 = 2.90;
		double precoAcem2 = 3.90;
		double precoFile1 = 4.90;
		double precoFile2 = 5.80;
		double precoAlcatra1 = 5.90;
		double precoAlcatra2 = 6.80;
		double precoPicanha1 = 6.90;
		double precoPicanha2 = 7.80;
		double quilosCarne = scan.nextDouble();
		double preco = 0;
		
		String tipo1="Acem";
		String tipo2="File Duplo";
		String tipo3="Alcatra";
		String tipo4="Picanha";
		
		
		
		
		switch (tipoCarne) {
		case 1: {
			if (quilosCarne <= 5) {
				preco = quilosCarne * precoAcem1;
				System.out.println("              Até 5kg\n");
				System.out.println(" ° " +tipo1+ " R$  " + precoAcem1+" por Kg  - ira pagar no total de " +quilosCarne+" Kg - R$ "+preco);
			} else {
				preco = quilosCarne * precoAcem2;
				System.out.println("             Acima de 5kg\n");
				System.out.println(" ° " +tipo1+ " R$  " + precoAcem2+" por Kg  - ira pagar no total de " +quilosCarne+" Kg - R$ "+preco);
			}
			break;
		}
		case 2: {
			if (quilosCarne <= 5) {
				preco = quilosCarne * precoFile1;
				System.out.println("              Até 5kg\n");
				System.out.println(" ° " +tipo2+ " R$  " + precoFile1+" por Kg  - ira pagar no total de " +quilosCarne+" Kg - R$ "+preco);
			} else {
				preco = quilosCarne * precoFile2;
				System.out.println("             Acima de 5kg\n");
				System.out.println(" ° " +tipo2+ " R$  " + precoFile2+" por Kg  - ira pagar no total de " +quilosCarne+" Kg - R$ "+preco);
			}
			break;
		}
		case 3: {
			if (quilosCarne <=5) {
				preco = quilosCarne * precoAlcatra1;
				System.out.println("              Até 5kg\n");
				System.out.println(" ° " +tipo3+ " R$  " + precoAlcatra1+" por Kg  - ira pagar no total de " +quilosCarne+" Kg - R$ "+preco);
			} else {
				preco = quilosCarne * precoAlcatra2;
				System.out.println("             Acima de 5kg\n");
				System.out.println(" ° " +tipo3+ " R$  " + precoAlcatra2+" por Kg  - ira pagar no total de " +quilosCarne+" Kg - R$ "+preco);
			}
			break;
		}
		case 4: {
			if (quilosCarne <= 5) {
				preco = quilosCarne * precoPicanha1;
				System.out.println("              Até 5kg\n");
				System.out.println(" ° " +tipo4+ " R$  " + precoPicanha1+" por Kg  - ira pagar no total de " +quilosCarne+" Kg - R$ "+preco);
			} else {
				preco = quilosCarne * precoPicanha2;
				System.out.println("             Acima de 5kg\n");
				System.out.println(" ° " +tipo4+ " R$  " + precoPicanha2+" por Kg  - ira pagar no total de " +quilosCarne+" Kg - R$ "+preco);
			}
			break;
		}

		}
		//System.out.println(				" Você Comprou a tipo" + tipoCarne + " esta levando" + quilosCarne + "kg e ira pagar " + preco);
	}
}
