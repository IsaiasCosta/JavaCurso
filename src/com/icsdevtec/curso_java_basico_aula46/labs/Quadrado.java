package com.icsdevtec.curso_java_basico_aula46.labs;

public class Quadrado extends FiguraD2 {

	
	 private int lado;

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		 
		return Math.pow(lado, 2);
	}
	 
}
