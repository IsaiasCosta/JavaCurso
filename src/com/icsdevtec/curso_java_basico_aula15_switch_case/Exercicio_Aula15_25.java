package com.icsdevtec.curso_java_basico_aula15_switch_case;

import java.util.Scanner;

/*
 * 25.Faça um programa que faça 5 perguntas para uma pessoa sobre um crime.
 *  As perguntas são:
	. "Telefonou para a vítima?"
	a. "Esteve no local do crime?"
	b. "Mora perto da vítima?"
	c. "Devia para a vítima?"
	d. "Já trabalhou com a vítima?" O programa deve no final emitir
	uma classificação sobre a participação da pessoa no crime. Se
	a pessoa responder positivamente a 2 questões ela deve ser
	classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5
	como "Assassino". Caso contrário, ele será classificado como
	"Inocente".*/
public class Exercicio_Aula15_25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Você esta sendo interrogado sobre um crime, responas as 5  perguntas, ok\n");

		System.out.println("Telefonou para a vítima?");
		String resposta1 = scan.next();

		System.out.println("Esteve no local do crime?");
		String resposta2 = scan.next();

		System.out.println("Mora perto da vítima?");
		String resposta3 = scan.next();

		System.out.println("Devia para a vítima?");
		String resposta4 = scan.next();

		System.out.println("Já trabalhou com a vítima?");
		String resposta5 = scan.next();

		int conResp = 0;
		if (resposta1.equalsIgnoreCase("S")) {
			conResp++;
		}
		if (resposta2.equalsIgnoreCase("S")) {
			conResp++;
		}
		if (resposta3.equalsIgnoreCase("S")) {
			conResp++;
		}
		if (resposta4.equalsIgnoreCase("S")) {
			conResp++;
		}
		if (resposta5.equalsIgnoreCase("S")) {
			conResp++;
		}
		if (conResp == 2) {
			System.out.println("Suspeita");
		} else if (conResp >= 3 || conResp == 4) {
			System.out.println("Cúmplice");
		} else if (conResp == 5) {
			System.out.println("Assassino");
		}else {
			System.out.println("Inocente");
		}

	}

}
