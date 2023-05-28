package com.icsdevtec.curso_java_basico_aula25;

public class Carro {
	// Atributos

	String marca;
	String modelo;
	int qdtPassageiros;
	double tanqueCombustivel;
	double consCombustivel;

	void exibirAutonomia() {
		// metodo sem retorno
		System.out.println("A autonomia do carro é : " + tanqueCombustivel * consCombustivel + "KM");
	}

	// metodo sem retorno
	double obterAutonomia() {
		System.out.println("Metodo obterAutonomia foi chamado " );
		return tanqueCombustivel * consCombustivel;
	}
}
