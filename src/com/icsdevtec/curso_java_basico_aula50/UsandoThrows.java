package com.icsdevtec.curso_java_basico_aula50;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {

		System.out.println("Entre com um nº decimal ");
		try {
			double num = lerNumero();
			System.out.println("N º Informado " + num );
		} catch (Exception e) {
			System.out.println("Entrada Invalida !");
			e.printStackTrace();
		}
	}

	public static double lerNumero() throws Exception {
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		return num;
	}

}
