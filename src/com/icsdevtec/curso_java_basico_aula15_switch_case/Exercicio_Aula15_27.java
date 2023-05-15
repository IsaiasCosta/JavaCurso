package com.icsdevtec.curso_java_basico_aula15_switch_case;

import java.util.Scanner;

/*
 * 27.Uma fruteira está vendendo frutas com a seguinte tabela de preços:
	Até 5 Kg              Acima de 5 Kg
	Morango R$ 2,50       por Kg R$ 2,20 por Kg
	Maçã R$ 1,80          por Kg R$ 1,50 por Kg
	Se o cliente comprar mais de 8 Kg em frutas ou o valor total da
	compra ultrapassar R$ 25,00, receberá ainda um desconto de
	10% sobre este total. Escreva um algoritmo para ler a
	quantidade (em Kg) de morangos e a quantidade (em Kg) de
	maças adquiridas e escreva o valor a ser pago pelo cliente*/
public class Exercicio_Aula15_27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe quantos quilos de  Morango esta levando e Maças esta comprando ");
		double morangoKilo = scan.nextDouble();

		System.out.println("Informe quantos quilos de  Morango esta levando");
		double macaKilo = scan.nextDouble();
		
		System.out.println("Quilos de Morango Kg"+morangoKilo+" e Quilos de Maça Kg"+macaKilo);
		
		double precoMorango1 = 2.50;
		double precoMorango2 = 2.20;
		double precoMaca1 = 1.80;
		double precoMaca2 = 1.50;
		double precoApagarMorango =0;
		double precoApagarMaca=0;
		double TotalKg=morangoKilo+morangoKilo;
		double precoTotal=precoApagarMaca+precoApagarMorango;
		double precoDesconto=0;
		
		if (morangoKilo > 5) {
			precoApagarMorango=morangoKilo*precoMorango1;
			System.out.println("Valor a ser pelos Morangos ==> "+precoApagarMorango);
		}
		else {
			precoApagarMorango=morangoKilo*precoMorango2;
			System.out.println("Valor a ser pelos Morangos ==> "+precoApagarMorango);
		}
		if(macaKilo > 5){
			precoApagarMaca=macaKilo*precoMaca1;
			System.out.println("Valor a ser pelos Morangos ==> "+precoApagarMaca);
		}
		else {
			precoApagarMaca=macaKilo*precoMaca2;
			System.out.println("Valor a ser pelos Morangos ==> "+precoApagarMaca);
		}
		if(TotalKg>=8 ||(precoTotal)>=25){
			precoDesconto=TotalKg*0.10;
			System.out.println("Valor com desconto "+precoDesconto);
		}else {
			precoDesconto=precoTotal*0.10;
			System.out.println(" Desconto"+precoDesconto);
		}
		
	}

}
