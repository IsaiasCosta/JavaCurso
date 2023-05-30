package com.icsdevtec.curso_java_basico_aula30;

public class Carro {
	// Atributos

	String marca;
	String modelo;
	int qdtPassageiros;
	double tanqueCombustivel;
	double consCombustivel;

	public Carro(String marca, String modelo, int qdtPassageiros, double tanqueCombustivel, double consCombustivel) {

		this.marca = marca; //this: referencia os atributos e os parametros da propria classe
		this.modelo = modelo;
		this.qdtPassageiros = qdtPassageiros;
		this.tanqueCombustivel = tanqueCombustivel;
		this.consCombustivel = consCombustivel;
	}

	public Carro() {

	}

	
	
	
	public Carro(String marca, String modelo, int qdtPassageiros) {
	
		this.marca = marca;
		this.modelo = modelo;
		this.qdtPassageiros = qdtPassageiros;
		System.out.println("Construtor de 3 parâmetros");
	}

	
	
	public Carro(String marca, String modelo) {
	    this(marca,modelo, 5);
	    System.out.println("Construtor de 2 parâmetros");
	}

	void exibirAutonomia() {
		// metodo sem retorno
		System.out.println("A autonomia do carro é : " + this.tanqueCombustivel * this.consCombustivel + "KM");
	}

	// metodo sem retorno
	double obterAutonomia() {
		System.out.println("Metodo obterAutonomia foi chamado ");
		return this.tanqueCombustivel * this.consCombustivel;
	}

	double calcularCombustivel(double km) {

		double qtdCombustivel = km / this.consCombustivel;
		return qtdCombustivel;
	}
}
