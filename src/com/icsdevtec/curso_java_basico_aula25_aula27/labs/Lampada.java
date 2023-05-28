package com.icsdevtec.curso_java_basico_aula25_aula27.labs;

public class Lampada {

	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	String[] tipos;

	boolean ligada;
 
	void ligarLampada() {
		ligada = true;
	}

	void desligarLampada() {
		ligada = false;
	}

	void mostrarEstado() {
		if (ligada) {
			System.out.println("A lampada esta ligada: ");
		} else {
			System.out.println("A lampada esta desligada ");
		}
	}

	void mudarEstado() {
		if (ligada) {
			desligarLampada();
		} else {
			ligarLampada();
		}
	}

}
