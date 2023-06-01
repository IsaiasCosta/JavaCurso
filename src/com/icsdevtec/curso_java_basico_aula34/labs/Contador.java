package com.icsdevtec.curso_java_basico_aula34.labs;

public class Contador {

	private static int contador;
	
	public static void incrementar() {
		contador++;
	}

	public static void zerar() {
		contador = 0;
	}

	public static int obterValor() {
		return contador;
	}
}
