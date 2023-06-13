package com.icsdevtec.curso_java_basico_aula46.labs;

public class Cubo extends FiguraD3 {

	private int aresta;

	public int getAresta() {
		return aresta;
	}

	public void setAresta(int aresta) {
		this.aresta = aresta;
	}

	@Override
	public double calcularArea() {

		return 6 * Math.pow(aresta, 2);
	}

	@Override
	public double calcularVolume() {

		return Math.pow(aresta, 3);
	}

}
