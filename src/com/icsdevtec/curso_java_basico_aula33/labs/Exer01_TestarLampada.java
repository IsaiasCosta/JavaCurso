package com.icsdevtec.curso_java_basico_aula33.labs;


public class Exer01_TestarLampada {

	public static void main(String[] args) {
		Lampada led = new Lampada();

		System.out.println("============ ");

		led.ligarLampada();
		led.mostrarEstado();
		led.mudarEstado();
		led.mostrarEstado();
		System.out.println("============ ");

		led.desligarLampada();

		led.mostrarEstado();
		led.mudarEstado();
		led.mostrarEstado();

	}

}
