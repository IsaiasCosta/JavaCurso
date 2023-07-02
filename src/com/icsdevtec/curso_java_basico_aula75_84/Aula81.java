package com.icsdevtec.curso_java_basico_aula75_84;

public class Aula81 {

	public static void main(String[] args) {

		String teste = "Teste";
		String testeMinusculo = teste.toLowerCase();
		String testeMaiusculo = teste.toUpperCase();
		System.out.println(testeMinusculo);
		System.out.println(testeMaiusculo);
		
		if (teste.toLowerCase().equals(teste.toLowerCase())) {
			System.out.println(teste);
		}

	}

}
