package com.icsdevtec.curso_java_basico_aula55;

import com.icsdevtec.curso_java_basico_aula53.DiaSemana;

public class TesteEnum2 {

	public static void main(String[] args) {

		//DiaSemana dia;

		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
		
		
		DiaSemana dia = (Enum.valueOf(DiaSemana.class, "SEGUNDA"));
		
		System.out.println(dia);
	
	}

}
