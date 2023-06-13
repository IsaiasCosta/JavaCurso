package com.icsdevtec.curso_java_basico_aula46.labs;

import java.util.Map;

public class Cilindro extends FiguraD3  {

	
	 private int altura;
	 
	 private double raio;

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		
		double areaBase = Math.PI*Math.pow(raio, 2);
		double areaLateral = (2*Math.PI*raio*raio*altura);
		double areaTotal = (2*areaBase)*(areaLateral);
		
		return areaTotal;
	}

	@Override
	public double calcularVolume() {
		
		return (Math.PI*Math.pow(raio, 2))*altura;
	}
	 
	 
	 
}
