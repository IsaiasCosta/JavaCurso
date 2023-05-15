package com.icsdevtec.curso_java_basico_aula15_switch_case;

import java.util.Scanner;

/*
 * 18.Faça um Programa que peça uma data no formato dd/mm/aaaa e
 determine se a mesma é uma data válida.
 */
public class Exercicio_Aula15_18 {

	public static void main(String[] args) {
		
		Scanner scan = new  Scanner(System.in);
		
		System.out.println("Entre com o Dia do Ano com 2 Digitos");
		int dia = scan.nextInt();
		
		System.out.println("Entre com o Mês do Ano com 2 Digitos");
		int mes = scan.nextInt();
		
		System.out.println("Entre com o Ano com 4 Digitos");
		int ano = scan.nextInt();
		
		if(dia <=31 && mes<=12 && ano>999  ){
			
			System.out.println("A Data informada é valida => "+dia+"/"+mes+"/"+ano);
		}else {
			System.out.println(" A Data esta com formato Invalido => "+dia+"/"+mes+"/"+ano);
		}			
		
	}

}
