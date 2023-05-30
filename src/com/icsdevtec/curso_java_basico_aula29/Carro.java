package com.icsdevtec.curso_java_basico_aula29;

public class Carro {
	// Atributos

	String marca;
	String modelo;
	int qdtPassageiros;
	double tanqueCombustivel;
	double consCombustivel;

	//Construtor comparâmetro
	public Carro(String marca, String modelo, int qdtPassageiros, double tanqueCombustivel, double consCombustivel) {
		super();
		this.marca = marca; //this: refencia os metodos e os atributos da propria classe
		this.modelo = modelo;
		this.qdtPassageiros = qdtPassageiros;
		this.tanqueCombustivel = tanqueCombustivel;
		this.consCombustivel = consCombustivel;
	}


	
	  Carro(){
		  System.out.println("Classe instanciada !!!");
		  
		  qdtPassageiros =5;
	  }
	void exibirAutonomia() {
		// metodo sem retorno
		System.out.println("A autonomia do carro é : " + tanqueCombustivel * consCombustivel + "KM");
	}

	// metodo com retorno
	double obterAutonomia() {
		System.out.println("Metodo obterAutonomia foi chamado ");
		return this.tanqueCombustivel * this.consCombustivel;
	}

	// metodo com retorno e palametros
	double calcularCombustivel(double km) {
		double qtdCombustive = km / consCombustivel;
		return qtdCombustive;
	}
}
