package com.icsdevtec.curso_java_basico_aula25_aula27.labs;

import com.icsdevtec.curso_java_basico_aula25_aula27.labs.Lampada;

public class TesteLampada {

	public static void main(String[] args) {
		Lampada led = new Lampada();

		led.modelo = "A60";
		led.tensao = "Bivolt";
		led.potencia = 7;
		led.cor = "Amarela";
		led.tipoLuz = "Amarela";
		led.garantiaMeses = 36;

		led.tipos = new String[3];

		led.tipos[0] = "Abajur";
		led.tipos[1] = "Lampeao";
		led.tipos[2] = "Luminaria";

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
