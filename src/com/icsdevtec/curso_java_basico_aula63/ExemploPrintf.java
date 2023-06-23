package com.icsdevtec.curso_java_basico_aula63;

public class ExemploPrintf {

	public static void main(String[] args) {

		System.out.printf("Hello %s", "Alo Mundo! ");// String
		System.out.println();
		System.out.printf("Hello %S", "Alo Mundo! "); // String
		System.out.println();
		System.out.printf("%c", 'c'); // Caracter
		System.out.println();
		System.out.printf("%C", 'c');// Caracter
		System.out.printf("%n");

		int valor = 123456789;

		System.out.printf("%d", valor); // nº inteiro
		System.out.println();

		double pontoFlutuante = 3.1456789;
		System.out.printf("%f", pontoFlutuante); // nº flutuante

		System.out.println();

		String olaMundo = "Ola, Mundo!";

		System.out.printf("%20s", olaMundo);
		System.out.println();
		System.out.printf("%-20s", olaMundo);

		System.out.println();
		System.out.printf("%+d", valor);

		System.out.println();
		System.out.printf("%15d", valor);

		System.out.println();
		System.out.printf("%,d", valor);
		System.out.println();
		int valor2 = -123456789;

		System.out.printf("% d", valor2);
		System.out.println();
		System.out.printf("% d", valor);

		System.out.println();
		System.out.printf("%.3f", pontoFlutuante);

		System.out.println();
		System.out.printf("R$%6.2f", pontoFlutuante);
		System.out.println();
		testeMaisCompleto();
	}

	private static void testeMaisCompleto() {
		double[] precos = { 1000, 123.32, 4578.568, 1, 5.45664 };

		for (int i = 0; i < precos.length; i++) {

			System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i + 1, precos[i]);
		}
	}
}
