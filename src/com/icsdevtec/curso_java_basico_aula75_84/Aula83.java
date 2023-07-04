package com.icsdevtec.curso_java_basico_aula75_84;

public class Aula83 {

	public static void main(String[] args) {

		String[] letras = { "A", "B", "C", "D", "E" };
		String alfabeto ="";
		
		
		// pode fazer assim
		for (String letra : letras) {
			alfabeto+=letra;
		}
		System.out.println(alfabeto);
		
		// o correto é assim
		
		StringBuffer sb = new StringBuffer();
		for (String letra : letras) {
			sb.append(letra);
		}
		alfabeto =sb.toString();
		System.out.println(alfabeto);
		
		alfabeto = new String(sb);
		
		System.out.println(alfabeto);
		
		System.out.println(sb.reverse());

		
		StringBuilder sb_ = new StringBuilder();
		for (String letra : letras) {
			sb_.append(letra);
		}
		alfabeto =sb_.toString();
		System.out.println(alfabeto);
	}

}
