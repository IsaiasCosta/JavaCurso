package com.icsdevtec.curso_java_basico_aula56.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadorEnum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		DecimalFormat decimal = new DecimalFormat("0.00");
		
		System.out.println("Digite  1º número ");
		double num1 = scan.nextDouble();
		System.out.println("Digite  2º número ");
		double num2 = scan.nextDouble();

		for (Operacao op : Operacao.values()) {

			System.out.print(decimal.format(num1) + " ");
			System.out.print(op.toString() + " ");
			System.out.print(decimal.format(num2)  + " = ");
			System.out.println(decimal.format(op.execultarOperacao(num1, num2)));
			//System.out.println(op.execultarOperacao(num1, num2));
		}

	}

}
