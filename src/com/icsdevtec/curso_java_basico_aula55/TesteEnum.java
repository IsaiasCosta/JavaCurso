package com.icsdevtec.curso_java_basico_aula55;

import com.icsdevtec.curso_java_basico_aula53.DiaSemana;

public class TesteEnum {

	public static void main(String[] args) {

		// Imprimindo todos os dias da semana com Enums

		DiaSemana[] dias = DiaSemana.values();

		for (int i = 0; i < dias.length; i++) {
			System.out.println(dias[i]);
		}
		System.out.println("=====================");
		for (DiaSemana dia : DiaSemana.values()) {
			System.out.println(dia);
		}
	}
   //
}
