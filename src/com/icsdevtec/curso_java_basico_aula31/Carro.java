package com.icsdevtec.curso_java_basico_aula31;

public class Carro {
	// Atributos

	String marca;
	String modelo;
	int qdtPassageiros;
	double tanqueCombustivel;
	double consCombustivel;

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
