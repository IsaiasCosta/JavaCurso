package com.icsdevtec.curso_java_basico_aula17;

import java.util.Scanner;

/*
 * 
 * 3. Faça um programa que leia e valide as seguintes informações:
	a. Nome: maior que 3 caracteres;
	b. Idade: entre 0 e 150;
	c. Salário: maior que zero;
	d. Sexo: 'f' ou 'm';
	e. Estado Civil: 's', 'c', 'v', 'd';
 * */
public class Exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean validar = false;
		String nome;
		int idade;
		double salario;
		String sexo;
		String civil;
		validar = false;
		do {
			System.out.println("Digite o seu nome ");
			nome = scan.next();

			if (nome.length() > 3) {
				validar = true;
				System.out.println("o seu nome é valido");
			} else {
				System.out.println("Entre o um nome maior que 3 carcateres " + nome);
			}
		} while (!validar);

		/*-----------------------------------------------------------------*/
		validar = false;
		do {
			System.out.println("Entre a sua idade");
			idade = scan.nextInt();

			if (idade <= 150) {
				validar = true;
				System.out.println("Sua idade é valida");
			} else {
				System.out.println("Sua idade dever ser menor que 150 anos " + idade);
			}
		} while (!validar);

		/*-----------------------------------------------------------------*/
		validar = false;
		do {
			System.out.println("Informe o seu salario");
			salario = scan.nextDouble();

			if (salario > 0) {
				validar = true;
				System.out.println("Seu salario é valido R$ " + salario);
			} else {
				System.out.println("Entre com um salario valido ");

			}
		} while (!validar);

		/*-----------------------------------------------------------------*/
		validar = false;
		do {
			System.out.println(" Informe o seu sexo ");
			sexo = scan.next();
			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				validar = true;
				System.out.println("Você informou um sexo valido " + sexo);
			} else {
				System.out.println("Informe um sexo valido ");
			}
		} while (!validar);
		
		/*-----------------------------------------------------------------*/
		validar = false;
		do {
			System.out.println(" Informe o seu estado civil ");
			civil = scan.next();

			if (civil.equalsIgnoreCase("s") || sexo.equalsIgnoreCase("c") || sexo.equalsIgnoreCase("v")
					|| sexo.equalsIgnoreCase("d")) {
				validar = true;
				System.out.println("Seu estado civil é  valido " + civil);
			} else {
				System.out.println("Informe estado civil valido ");
			}

		} while (!validar);

	}

}
