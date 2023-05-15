package com.icsdevtec.curso_java_basico_aula15_switch_case;

import java.util.Scanner;

public class Exercicio_Aula15_11 {
	/*
	 * 11.As Organizações Tabajara resolveram dar um aumento de salário aos seus
	 * colaboradores e lhe contraram para desenvolver o programa que calculará os
	 * reajustes. o Faça um programa que recebe o salário de um colaborador e o
	 * reajuste segundo o seguinte critério, baseado no salário atual: o salários
	 * até R$ 280,00 (incluindo) : aumento de 20% o salários entre R$ 280,00 e R$
	 * 700,00 : aumento de 15% o salários entre R$ 700,00 e R$ 1500,00 : aumento de
	 * 10% o salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser
	 * realizado, informe na tela: o o salário antes do reajuste; o o percentual de
	 * aumento aplicado; o o valor do aumento; o o novo salário, após o aumento
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o salario atual do funcionario !!!");
		double salarioAtual = scan.nextDouble();

		if (salarioAtual <= 280) {
			double salarioAntes = salarioAtual;
			double percentual=20;
			double aumento = (salarioAtual * 0.20);
			salarioAtual = aumento + salarioAtual;
			System.out.println(	"o salário antes do reajuste " + salarioAntes + " com aumento de "+percentual+ "% Você recebeu um aumento de R$" + aumento + " Seu salario passou a ser R$" + salarioAtual);
		}else if (salarioAtual >= 280 && salarioAtual <= 700) {
			double salarioAntes = salarioAtual;
			double percentual=15;
			double aumento = (salarioAtual * 0.15);
			salarioAtual = aumento + salarioAtual;
			System.out.println(	"o salário antes do reajuste " + salarioAntes + " com aumento de "+percentual+ "% Você recebeu um aumento de R$" + aumento + " Seu salario passou a ser R$" + salarioAtual);
		}else if (salarioAtual >= 700 && salarioAtual <= 1500) {
			double salarioAntes = salarioAtual;
			double percentual=10;
			double aumento = (salarioAtual * 0.10);
			salarioAtual = aumento + salarioAtual;
			System.out.println(	"o salário antes do reajuste " + salarioAntes + " com aumento de "+percentual+ "% Você recebeu um aumento de R$" + aumento + " Seu salario passou a ser R$" + salarioAtual);
		} else if (salarioAtual >= 1500) {
			double salarioAntes = salarioAtual;
			double percentual=5;
			double aumento = (salarioAtual * 0.05);
			salarioAtual = aumento + salarioAtual;
			System.out.println(	"o salário antes do reajuste " + salarioAntes + " com aumento de "+percentual+ "% Você recebeu um aumento de R$" + aumento + " Seu salario passou a ser R$" + salarioAtual);
		}
	}

}
