package com.icsdevtec.curso_java_basico_aula85_100;

import java.util.Random;

public class Aula_99_Numeros_Aleatorios {

	public static void main(String[] args) {

		System.out.println(Math.floor(Math.random()*10));
		
		
		Random aleatorio = new Random();
		System.out.println(aleatorio.nextInt());
		System.out.println(aleatorio.nextInt(101));
	}

}
